package com.wardendev.hillelproject.shapes;

import java.util.Scanner;

import com.wardendev.hillelproject.action.UserAction;

public class Circle extends UserAction {
    private final Scanner scanner;

    public Circle(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("Area of circle = " + area);
    }

    @Override
    public String getActionName() {
        return "Count the area of circle";
    }
}
