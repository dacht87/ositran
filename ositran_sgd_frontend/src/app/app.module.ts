import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import {app_routing} from "./app.routes";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RecibidosComponent } from './components/recibidos/recibidos.component';
import { Recibidos2Component } from './components/recibidos2/recibidos2.component';
import { FirmarComponent } from './components/firmar/firmar.component';
import { EnviadosComponent } from './components/enviados/enviados.component';

@NgModule({
  declarations: [
    AppComponent,
    RecibidosComponent,
    Recibidos2Component,
    FirmarComponent,
    EnviadosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    app_routing,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
