package com.wardendev.hillelproject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.wardendev.hillelproject.customer.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Customer> customerMap = new HashMap<>();

        List<CustomerWithId> customers = Arrays.asList(
            new CustomerWithId(1, "John", "Doe"),
            new CustomerWithId(2, "Jane", "Doe"),
            new CustomerWithId(3, "Alice", "Smith"),
            new CustomerWithId(4, "Robert", "Smith")
        );

        customerMap.putAll(customers.stream().collect(Collectors.toMap(CustomerWithId::getId, Customer::getCustomer)));

        System.out.println("Map Values: ");
        customerMap.values().forEach(v -> System.out.println(v.toString()));

        System.out.println("\nMap Keys: ");
        customerMap.keySet().forEach(System.out::println);

        System.out.println("\nMap Keys and Values: ");
        customerMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
        System.out.println();
    }
}
