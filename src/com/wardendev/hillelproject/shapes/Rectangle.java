package com.wardendev.hillelproject.shapes;

import java.util.Scanner;

import com.wardendev.hillelproject.action.UserAction;

public class Rectangle extends UserAction {
    private final Scanner scanner;

    public Rectangle(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Area of rectangle = " + length * width);
    }

    @Override
    public String getActionName() {
        return "Count the area of rectangle";
    }

}
