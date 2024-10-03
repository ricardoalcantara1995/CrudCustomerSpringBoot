package com.crud.customer.CRUD.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    @Column(name = "name")
    @NotBlank(message = "name is mandatory")
    private String name;
    @Column(name = "lastname")
    @NotBlank(message = "lastName is mandatory")
    private String lastName;
    @NotBlank(message = "email is mandatory")
    @Column(unique = true, name = "email")
    private String email;
    @NotBlank(message = "phone is mandatory")
    @Column(name = "phone")
    private String phone;
}
