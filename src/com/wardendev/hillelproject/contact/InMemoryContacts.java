package com.wardendev.hillelproject.contact;

import java.util.ArrayList;

public class InMemoryContacts {
    private final static ArrayList<Contact> contacts = new ArrayList<>();

    public static ArrayList<Contact> getAll() {
        return contacts;
    }

    public static void add(Contact contact) {
        contacts.add(contact);
    }

    public static Contact get(int index) {
        return contacts.get(index);
    }

    public static void set(int index, Contact contact) {
        contacts.set(index, contact);
    }

    public static void remove(int index) {
        contacts.remove(index);
    }

    public static int size() {
        return contacts.size();
    }
}
