package com.wardendev.hillelproject.menu;

import java.util.Scanner;

import com.wardendev.hillelproject.contact.InMemoryContacts;

public class RemoveContactMenuAction implements IMenuAction {
    private final Scanner scanner;

    public RemoveContactMenuAction(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getName() {
        return "Remove Contact";
    }

    @Override
    public void execute() {
        System.out.print("\nEnter contact index number: ");
        int index = scanner.nextInt();

        if(index - 1 > InMemoryContacts.size()) { 
            System.err.println("Failed to remove contact with index " + index);
            return; 
        }

        InMemoryContacts.remove(index - 1);
    }

    @Override
    public boolean closeAfter() {
        return false;
    }

}
