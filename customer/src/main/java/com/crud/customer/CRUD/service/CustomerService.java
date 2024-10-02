package com.crud.customer.CRUD.service;

import com.crud.customer.CRUD.dto.CustomerDTO;
import com.crud.customer.CRUD.model.Customer;
import com.crud.customer.CRUD.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer>allCustomers(){
        return customerRepository.findAll();
    }
    public Customer OneCustomer(Long id){
        return customerRepository.findById(id).get();
    }
    public Customer saveCustomer(CustomerDTO dto){
        Customer customer = new Customer(dto.getName(), dto.getLastName(), dto.getEmail(),dto.getPhone());
        return customerRepository.save(customer);
    }
}
