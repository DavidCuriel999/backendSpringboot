package com.friendlys.app.friendlysAppofficial.controllers;

import com.friendlys.app.friendlysAppofficial.domain.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/clientes")
// Solo simulamos una base de datos No es practico
public class CustomerController {

    private List<Customer> customers = new ArrayList<>(List.of(
            new Customer(123, "Gerrardo Lopez", "gerardol","contrasena123"),
            new Customer(456, "Alenjandro Garcia", "alegarcia", "clave456"),
            new Customer(769, "Laura Sanchez", "Lauras", "secreto789"),
            new Customer(234,"Carlos Martinez", "carlosm", "password234")
    ));
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {

        return ResponseEntity.ok(customers);
        //return customers;
    }

    //@RequestMapping(value = "/{username}", method = RequestMethod.GET)
    @GetMapping("/{username}")
    public ResponseEntity<?> getCliente(@PathVariable String username){
        for (Customer c : customers) {
            if(c.getUsername().equalsIgnoreCase(username)) {
                return ResponseEntity.ok(c);
                //return c;
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encotrado con username: "+ username);
       // return null; // Mala practica

    }
    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public Customer postCliente(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public Customer putCliente(@RequestBody Customer customer) {
        for (Customer c : customers) {
            if (c.getID() == customer.getID()) {
                c.setName(customer.getName());
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());
                return c;
            }
        }
        return null; //Es mala practica se utiliza Manejo de excepciones
    }

    //@RequestMapping(value= "/{id}", method =RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public Customer deleteCliente(@PathVariable int id){ ;
        for (Customer c : customers) {
            if (c.getID() == id) {
                customers.remove(c);

                return c;
            }
        }
        return null;
    }

    //@RequestMapping(method = RequestMethod.PATCH)
    @PatchMapping
    public Customer patchCliente(@RequestBody Customer customer){
        for(Customer c : customers){
            if(c.getID() == customer.getID()){

                if(customer.getName() != null){
                    c.setName(customer.getName());
                }
                if (customer.getUsername() != null){
                    c.setUsername(customer.getUsername());

                }
                if(customer.getPassword() != null){
                    c.setPassword(customer.getPassword());

                }
                return c;
            }
        }
        return null;
    }

}
