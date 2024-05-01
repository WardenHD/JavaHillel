package com.wardendev.hillelproject.shapes;

import java.util.Scanner;
import java.util.stream.IntStream;

import com.wardendev.hillelproject.action.UserAction;

public class Triangle extends UserAction {
    private final Scanner scanner;

    public Triangle(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void doAction() {
        int sides[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the length of side " + Integer.toString(i + 1) + ": ");
            sides[i] = scanner.nextInt();
        }
                
        float s = IntStream.of(sides).sum() / 2;
        int area = (int) Math.round(Math.sqrt(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]))); 

        System.out.println("Area of a SSS triangle = " + area);

    }

    @Override
    public String getActionName() {
        return "Count the area of a SSS triangle";
    }
}
