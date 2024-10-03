package com.crud.customer.CRUD.service.impl;

import com.crud.customer.CRUD.dto.CustomerDTO;
import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.CRUD.repository.CustomerRepository;
import com.crud.customer.CRUD.service.CustomerService;
import com.crud.customer.GLOBAL.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer>allCustomers(){
        return customerRepository.findAll();
    }
    public Customer oneCustomer(Long id) throws  ResourceNotFoundException {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found or not exist"));
    }
    public Customer saveCustomer(CustomerDTO dto){
        Customer customer = new Customer(dto.getName(), dto.getLastName(), dto.getEmail(),dto.getPhone());
        return customerRepository.save(customer);
    }
    public Customer updateCustomer(Long id, CustomerDTO dto) throws ResourceNotFoundException {
        Customer customerUpdate = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found or not exist"));

        customerUpdate.setName(dto.getName());
        customerUpdate.setLastName(dto.getLastName());
        customerUpdate.setEmail(dto.getEmail());
        customerUpdate.setPhone(dto.getPhone());
        return customerRepository.save(customerUpdate);
    }
    public Customer deleteOne(Long id) throws ResourceNotFoundException {
        Customer customerDelete =  customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found or not exist"));
                customerRepository.delete(customerDelete);
        return customerDelete;
    }

}
