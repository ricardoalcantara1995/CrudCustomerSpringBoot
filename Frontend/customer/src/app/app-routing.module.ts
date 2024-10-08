import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListComponent } from './customer/list.component';
import { DetailComponent } from './customer/detail.component';
import { UpdateComponent } from './customer/update.component';
import { CreateComponent } from './customer/create.component';

const routes: Routes = [
  {path:'',component: ListComponent},
  {path:'detail',component: DetailComponent},
  {path:'update',component: UpdateComponent},
  {path:'create',component: CreateComponent},
  {path:'**',redirectTo:'', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
