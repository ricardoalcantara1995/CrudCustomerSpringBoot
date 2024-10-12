import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../services/customer.service';
import { Customer } from '../model/customer';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{
  customers : Customer[] = []; 
  constructor(
    private customerservice : CustomerService,
    private toastrservice : ToastrService
  ){}
  ngOnInit(): void {
    this.getCustomers();
  }

  getCustomers(): void{
    this.customerservice.list().subscribe(
      data => {
        this.customers = data;
        console.log(this.customers);
      },
      err =>{
        this.toastrservice.error(err.error.message, "Error",{timeOut:3000,positionClass: "toast-top-center"})
      }
    );
  }
}
