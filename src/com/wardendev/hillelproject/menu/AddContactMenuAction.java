package com.wardendev.hillelproject.menu;

import java.util.Scanner;

import com.wardendev.hillelproject.contact.Contact;
import com.wardendev.hillelproject.contact.InMemoryContacts;

public class AddContactMenuAction implements IMenuAction {

    private final Scanner scanner;

    public AddContactMenuAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return "Add Contact";
    }

    @Override
    public void execute() {
        System.out.print("\nEnter contact name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println('\n');

        Contact contact = new Contact(name,phoneNumber);
        InMemoryContacts.add(contact);
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
