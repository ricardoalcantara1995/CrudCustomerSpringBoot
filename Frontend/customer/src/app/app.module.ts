import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

//Componentes

import { ListComponent } from './customer/list.component';
import { DetailComponent } from './customer/detail.component';
import { CreateComponent } from './customer/create.component';
import { UpdateComponent } from './customer/update.component';
import { MenuComponent } from './menu/menu.component';

//Paquetes de terceros

//SweetAlert2
import { SweetAlert2Module } from '@sweetalert2/ngx-sweetalert2';
//animations
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
//toastr
import { ToastrModule } from 'ngx-toastr';


@NgModule({
  declarations: [
    AppComponent,
    ListComponent, 
    DetailComponent, 
    CreateComponent,  
    UpdateComponent, MenuComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SweetAlert2Module.forRoot(),
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    HttpClientModule,  
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
