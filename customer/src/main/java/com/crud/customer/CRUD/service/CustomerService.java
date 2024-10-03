package com.crud.customer.CRUD.service;

import com.crud.customer.CRUD.dto.CustomerDTO;
import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.GLOBAL.exceptions.AttributeException;
import com.crud.customer.GLOBAL.exceptions.ResourceNotFoundException;

import java.util.List;

public interface CustomerService {
    List<Customer> allCustomers();
    Customer oneCustomer(Long id) throws ResourceNotFoundException;
    Customer saveCustomer(CustomerDTO dto) throws AttributeException;
    Customer updateCustomer(Long id, CustomerDTO dto) throws ResourceNotFoundException;
    Customer deleteOne(Long id) throws ResourceNotFoundException;
}
