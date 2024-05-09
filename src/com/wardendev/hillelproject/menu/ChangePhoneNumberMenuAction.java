package com.wardendev.hillelproject.menu;

import java.util.Scanner;

import com.wardendev.hillelproject.contact.Contact;
import com.wardendev.hillelproject.contact.InMemoryContacts;

public class ChangePhoneNumberMenuAction implements IMenuAction {
    private final Scanner scanner;

    public ChangePhoneNumberMenuAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return "Change contact phone number";
    }

    @Override
    public void execute() {
        System.out.print("\nEnter contact index: ");
        int index = scanner.nextInt();

        if(index - 1 > InMemoryContacts.size()) { 
            System.err.println("Failed to remove contact with index " + index);
            return; 
        }

        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.next();

        Contact contact = InMemoryContacts.get(index - 1);
        contact.setPhoneNumber(phoneNumber);
        InMemoryContacts.set(index - 1, contact);
    }

    @Override
    public boolean closeAfter() {
        return false;
    }

}
