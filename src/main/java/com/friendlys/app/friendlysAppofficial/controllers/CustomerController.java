package com.friendlys.app.friendlysAppofficial.controllers;

import com.friendlys.app.friendlysAppofficial.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.List;


@RestController

public class CustomerController {

    private List<Customer> customers = new ArrayList<>(List.of(
            new Customer(123, "Gerrardo Lopez", "gerardol","contrasena123"),
            new Customer(456, "Alenjandro Garcia", "alegarcia", "clave456"),
            new Customer(769, "Laura Sanchez", "Lauras", "secreto789"),
            new Customer(234,"Carlos Martinez", "carlosm", "password234")
    ));

    @GetMapping("clientes")
    public List<Customer> getCustomers() {
        return customers;
    }
}
