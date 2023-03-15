package com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String name;
    private final String year;
    private final int lengthInfo;

    public Book(String author, String name, String year) {
        this.author = author;
        this.name = name;
        this.year = year;
        lengthInfo = author.length() + name.length() + year.length() + 4;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    public String toString() {
        return author + ", " + name + ", " + year;
    }
}