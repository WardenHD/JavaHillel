package com.wardendev.hillelproject;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Some string", 8904);
        System.out.println("First: " + pair.getFirst() + ", Second: " + pair.getSecond());
    }
}
