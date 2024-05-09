package com.wardendev.hillelproject;

import java.util.Scanner;

import com.wardendev.hillelproject.contact.*;
import com.wardendev.hillelproject.menu.AddContactMenuAction;
import com.wardendev.hillelproject.menu.ChangePhoneNumberMenuAction;
import com.wardendev.hillelproject.menu.ExitMenuAction;
import com.wardendev.hillelproject.menu.IMenuAction;
import com.wardendev.hillelproject.menu.Menu;
import com.wardendev.hillelproject.menu.RemoveContactMenuAction;
import com.wardendev.hillelproject.menu.ShowContactsMenuAction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contact contact1 = new Contact("Nikita", "+380633285455");
        Contact contact2 = new Contact("Ivan", "+35766023354");
        InMemoryContacts.add(contact1);
        InMemoryContacts.add(contact2);

        IMenuAction[] actions = new IMenuAction[]{
            new AddContactMenuAction(scanner),
            new RemoveContactMenuAction(scanner),
            new ChangePhoneNumberMenuAction(scanner),
            new ShowContactsMenuAction(),
            new ExitMenuAction()
        };

        Menu menu = new Menu(scanner);
        for (IMenuAction action : actions) menu.addAction(action);

        menu.run();
    }
}
