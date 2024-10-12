import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Customer } from '../model/customer';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  customerURL =  "http://192.168.18.12:8080/customer/"+ "all"
  constructor(private httpClient:HttpClient ) { }
  public list(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(this.customerURL);
  }
}
  