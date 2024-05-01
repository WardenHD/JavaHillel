package com.wardendev.hillelproject;

import java.util.Scanner;

import com.wardendev.hillelproject.action.ExitAction;
import com.wardendev.hillelproject.action.UserAction;
import com.wardendev.hillelproject.shapes.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        UserAction[] userActions = new UserAction[] {
                new Circle(scanner),
                new Rectangle(scanner),
                new Triangle(scanner),
                new ExitAction()
        };

        for (int i = 0; i < userActions.length; i++) System.out.println(i + 1 + " " + userActions[i].getActionName());

        System.out.print("Choose menu action: ");
        int choice = scanner.nextInt() - 1;

        if (choice >=0 && choice < userActions.length) userActions[choice].doAction();
        else System.err.println("You chose an invalid menu action!");
    }
}
