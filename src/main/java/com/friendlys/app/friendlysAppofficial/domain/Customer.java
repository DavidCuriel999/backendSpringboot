package com.friendlys.app.friendlysAppofficial.domain;
//Clase POJO

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    //atributos

    private int ID;

    private String name;

    private String username;

    private String password;

    //Constructor
    public Customer(int ID, String name, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    
}
