package com.crud.customer.CRUD.controller;

import com.crud.customer.CRUD.dto.CustomerDTO;
import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.CRUD.service.CustomerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDTO dto){
        return ResponseEntity.ok(customerService.saveCustomer(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Customer>updateCustomer(@PathVariable("id") Long id,@RequestBody CustomerDTO dto){
        return ResponseEntity.ok(customerService.updateCustomer(id,dto));
    }

}
