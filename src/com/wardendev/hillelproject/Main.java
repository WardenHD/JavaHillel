package com.wardendev.hillelproject;

import com.wardendev.hillelproject.book.BookLibrary;

public class Main {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.add("Harry Potter", "J.K. Rowling", 1997);
        bookLibrary.add("Harry Potter", "J.K. Rowling", 1997);
        bookLibrary.add("The Hobbit", "J.R.R. Tolkien", 1937);
        bookLibrary.add("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        bookLibrary.add("The Lord of the Rings", "J.R.R. Tolkien", 2301);
        bookLibrary.add("The Lord of the Rings", "J.R.R. Tolkien", -793478);

        bookLibrary.remove("Harry Potter", "J.K. Rowling");
        bookLibrary.remove("The Lord of the Rings", "None");

        System.out.println(bookLibrary.find(1997));
        System.out.println(bookLibrary.find(2022));

        System.out.println(bookLibrary.find("J.K. Rowling"));
        System.out.println(bookLibrary.find("hduifhsduihf"));
    }
}
