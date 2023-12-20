import { Component } from '@angular/core';
import { ApiService } from './service/api.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  data: any = {};
  title = 'ositran_sgd_frontend';

  constructor(private apiService: ApiService){}

  ngOnInit ():void{
    this.llenarData();
  }
  llenarData(){
    this.apiService.getData().subscribe(data=>{
      this.data=data;
      console.log(this.data)
    })
  }
}
