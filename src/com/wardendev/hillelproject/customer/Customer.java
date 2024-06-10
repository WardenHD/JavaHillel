package com.wardendev.hillelproject.customer;

public class Customer {
    private final String name, surname;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }

    public Customer getCustomer() {
        return this;
    }


    @Override
    public String toString() {
        return "Customer - " + surname + " " + name;
    }
}
