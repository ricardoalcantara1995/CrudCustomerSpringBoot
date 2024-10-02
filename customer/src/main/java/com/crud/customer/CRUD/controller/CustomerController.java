package com.crud.customer.CRUD.controller;

import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.CRUD.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>>allCustomers(){
            return ResponseEntity.ok(customerService.allCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> oneCustomer(@PathVariable("id") Long id){
        return ResponseEntity.ok(customerService.oneCustomer(id));
    }

}
