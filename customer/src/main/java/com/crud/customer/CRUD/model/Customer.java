package com.crud.customer.CRUD.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, name = "nae")
    private String name;
    @Column(unique = true, name = "lastname")
    private String lastName;
    @Column(unique = true, name = "email")
    private String email;
    @Column(unique = true, name = "phone")
    private String phone;
}
