import {RouterModule,Routes} from '@angular/router';
import {RecibidosComponent} from './components/recibidos/recibidos.component';
import {Recibidos2Component} from './components/recibidos2/recibidos2.component';
import {EnviadosComponent} from './components/enviados/enviados.component';
import {FirmarComponent} from './components/firmar/firmar.component';


const app_routes: Routes = [
  {path: 'Inicio',component:RecibidosComponent },
  {path: 'Recibidos2',component:Recibidos2Component },
  {path: 'Enviados',component:EnviadosComponent},
  {path: 'Firmar',component:FirmarComponent},
  {path: '**',pathMatch: 'full', redirectTo:''}
];

export const app_routing = RouterModule.forRoot(app_routes);
