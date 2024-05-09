package com.wardendev.hillelproject.menu;

import com.wardendev.hillelproject.contact.*;

public class ShowContactsMenuAction implements IMenuAction {

    @Override
    public String getName() {
        return "Show Contacts";
    }

    @Override
    public void execute() {
        System.out.println("\n=================");

        for (int i = 0; i < InMemoryContacts.size(); i++) {
            Contact contact = InMemoryContacts.get(i);
            System.out.println((i + 1) + ": " + contact.getName() + " " + contact.getPhoneNumber());
        }
        
        System.out.println("=================\n");
    }

    @Override
    public boolean closeAfter() {
        return false;
    }

}
