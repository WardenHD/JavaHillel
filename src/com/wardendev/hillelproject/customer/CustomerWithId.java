package com.wardendev.hillelproject.customer;

public class CustomerWithId extends Customer {
    private int id;

    public CustomerWithId(int id, String name, String surname) {
        super(name, surname);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }
}
