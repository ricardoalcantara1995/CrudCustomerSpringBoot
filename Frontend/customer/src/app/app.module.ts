import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

//Paquetes de terceros

//SweetAlert2
import { SweetAlert2Module } from '@sweetalert2/ngx-sweetalert2';
//animations
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
//toastr
import { ToastrModule } from 'ngx-toastr';
import { ListComponent } from './customer/list.component';
import { DetailComponent } from './customer/detail.component';
import { CreateComponent } from './customer/create.component';
import { UpdateComponent } from './customer/update.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent, 
    DetailComponent, 
    CreateComponent,  
    UpdateComponent  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SweetAlert2Module.forRoot(),
    BrowserAnimationsModule,
    ToastrModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
