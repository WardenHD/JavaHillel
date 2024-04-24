package com.wardendev.hillelproject;

import com.wardendev.hillelproject.person.Person;
import com.wardendev.hillelproject.person.PersonsList;

public class Main {
    static PersonsList list = new PersonsList();

    public static void main(String[] args) {
        list.add(new Person(1001, "Steve"));
        list.add(new Person(1021, "Joseph"));
        list.add(new Person(1101, "Bob"));
        list.add(new Person(1401, "Emily"));
        list.add(new Person(1901, "Karl"));
        list.add(new Person(2011, "John"));

        list.printArray();
    }
}
