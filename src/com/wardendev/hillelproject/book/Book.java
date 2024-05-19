package com.wardendev.hillelproject.book;

import java.util.Objects;

public class Book {
    private String name, author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Book that = (Book) obj;
        return name == that.name && author == that.author && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }

    @Override
    public String toString() {
        return "(Name: " + name + ", Author: " + author + ", Year: " + year + ")";
    }
}
