package dev.endcraft.rest.devrest.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String custumerName;

    private String custumerEmail;

    public Customer(String custumerName, String custumerEmail){
        this.custumerEmail = custumerEmail;
        this.custumerName = custumerName;
    }

    public Customer(){}

    @Override
    public String toString() {
        return String.format("{\"id\": \"%d\", \"nome\": \"%s\", \"email\": \"%s\"}", id, custumerName, custumerEmail);
    }
}