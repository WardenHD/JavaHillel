package com.wardendev.hillelproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // I used slightly different method because I work with Java 8
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Alice", 23, 12),
            new Student("Bob", 22, 7),
            new Student("Charlie", 25, 9),
            new Student("David", 11, 7),
            new Student("Eve", 6, 1)
        ));

        List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
           .filter(x -> x % 2==0)
           .collect(Collectors.toList());

        ArrayList<Student> studentsOld = new ArrayList<>(students.stream().filter(s -> s.getAge() > 22).collect(Collectors.toList()));
        ArrayList<String> studentNames = new ArrayList<>(students.stream().map(s -> s.getName()).collect(Collectors.toList()));

        System.out.println(students);
        System.out.println(evenNumbers);
        System.out.println(studentsOld);
        System.out.println(studentNames);
        System.out.println("Sum: " + students.stream().map(s -> s.getAge()).reduce(0, Integer::sum));

    }
}
