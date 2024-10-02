package com.crud.customer.CRUD.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastName;
    @Column(unique = true, name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
}
