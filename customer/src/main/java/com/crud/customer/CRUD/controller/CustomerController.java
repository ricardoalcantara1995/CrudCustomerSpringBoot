package com.crud.customer.CRUD.controller;

import com.crud.customer.CRUD.dto.CustomerDTO;
import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.CRUD.service.impl.CustomerServiceImpl;
import com.crud.customer.GLOBAL.exceptions.AttributeException;
import com.crud.customer.GLOBAL.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>>allCustomers(){
            return ResponseEntity.ok(customerService.allCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> oneCustomer(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return ResponseEntity.ok(customerService.oneCustomer(id));
    }
    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody CustomerDTO dto) throws AttributeException {
        return ResponseEntity.ok(customerService.saveCustomer(dto));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Customer>updateCustomer(@PathVariable("id") Long id,@RequestBody CustomerDTO dto) throws ResourceNotFoundException,AttributeException {
        return ResponseEntity.ok(customerService.updateCustomer(id,dto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Customer>deleteOne(@PathVariable("id")Long id)throws ResourceNotFoundException{
        return  ResponseEntity.ok(customerService.deleteOne(id));
    }
}
