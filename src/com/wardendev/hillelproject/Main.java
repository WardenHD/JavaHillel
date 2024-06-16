package com.wardendev.hillelproject;

import com.wardendev.hillelproject.list.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.print();

        list.removeLast();
        System.out.println('\n');
        list.print();

    } 
}
