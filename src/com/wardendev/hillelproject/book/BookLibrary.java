package com.wardendev.hillelproject.book;

import java.util.ArrayList;
import java.util.Calendar;

import com.wardendev.hillelproject.book.BooksException.*;

public class BookLibrary extends ArrayList<Book> {

    public boolean add(String name, String author, int year) {
        Book book = new Book(name, author, year);
        if(this.contains(book))
            try {
                throw new DuplicateBookException("The book " + book.toString() + " is already in library!");
            } 
            catch (DuplicateBookException e) {
                System.err.println(e.getMessage());
            }

        if(book.getYear() > Calendar.getInstance().get(Calendar.YEAR))
            try {
                throw new TooFutureBookException("The book " + book.toString() + " is from the future!");
            } 
            catch (TooFutureBookException e) {
                System.err.println(e.getMessage());
            } 

        if(book.getYear() < 0)
            try {
                throw new TooAncientBookException("The book " + book.toString() + " is undiscovered yet!");
            } 
            catch (TooAncientBookException e) {
                System.err.println(e.getMessage());
            } 

        return super.add(book);
    }

    public boolean remove(String name, String author) {
        Book book = new Book(name, author, -1);
        this.forEach(b -> {
            if(b.getName().equals(name) && b.getAuthor().equals(author)) {
                book.setYear(b.getYear());
            }
        });

        if(book.getYear() == -1)
            try {
                throw new BookNotFoundException("No such book " + book.toString());
            } 
            catch (BookNotFoundException e) {
                System.err.println(e.getMessage());
            }
        
        return super.remove(book);
    }

    public ArrayList<Book> find(String author) {
        ArrayList<Book> books = new ArrayList<Book>();
        this.forEach(b -> {
            if(b.getAuthor().equals(author)) books.add(b);
        });

        return books;
    } 

    public ArrayList<Book> find(int year) {
        ArrayList<Book> books = new ArrayList<Book>();
        this.forEach(b -> {
            if(b.getYear() == year) books.add(b);
        });

        return books;
    } 
}
