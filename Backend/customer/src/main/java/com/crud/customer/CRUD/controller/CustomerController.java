package com.crud.customer.CRUD.controller;

import com.crud.customer.CRUD.dto.CustomerDTO;
import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.CRUD.service.impl.CustomerServiceImpl;
import com.crud.customer.GLOBAL.dto.MessageDTO;
import com.crud.customer.GLOBAL.exceptions.AttributeException;
import com.crud.customer.GLOBAL.exceptions.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
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
    public ResponseEntity<MessageDTO> saveCustomer(@Valid @RequestBody CustomerDTO dto) throws AttributeException {
        Customer newCustomer = customerService.saveCustomer(dto);
        String messageSave = "Customer :" + newCustomer.getName() +" "+newCustomer.getLastName()+" " +
                "With id : "+newCustomer.getId() + " has be created";
        return ResponseEntity.ok(new MessageDTO(HttpStatus.OK,messageSave));
    }
    @PutMapping("/{id}")
    public ResponseEntity<MessageDTO>updateCustomer(@PathVariable("id") Long id,@Valid @RequestBody CustomerDTO dto) throws ResourceNotFoundException,AttributeException {
        Customer updateCustomer = customerService.updateCustomer(id,dto);
        String messageUpdate = "Customer :" + updateCustomer.getName() +" "+updateCustomer.getLastName()+" " +
                "With id : "+updateCustomer.getId() + " has be updated";
        return ResponseEntity.ok(new MessageDTO(HttpStatus.OK,messageUpdate));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<MessageDTO>deleteOne(@PathVariable("id")Long id)throws ResourceNotFoundException{
        Customer deleteCustomer = customerService.deleteOne(id);
        String messageDeleted = "Customer :" + deleteCustomer.getName() +" "+deleteCustomer.getLastName()+" " +
                "With id : "+deleteCustomer.getId() + " has be Deleted";
        return  ResponseEntity.ok(new MessageDTO(HttpStatus.OK,messageDeleted));
    }
}
