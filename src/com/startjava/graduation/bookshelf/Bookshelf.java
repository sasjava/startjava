package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bookshelf {
    private Book[] books;
    private int numberOfBooks;
    private int maxLengthInfo;

    public Bookshelf(int booksNumber) {
        books = new Book[booksNumber];
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, numberOfBooks);
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public int getMaxLengthInfo() {
        return maxLengthInfo;
    }

    public int getEmptyShelves() {
        return books.length - numberOfBooks;
    }

    public boolean isFull() {
        return books.length == numberOfBooks;
    }

    public void addBook(String author, String name, String year) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = new Book(author, name, year);
            int newLengthInfo = books[numberOfBooks].getLengthInfo();
            if (newLengthInfo > maxLengthInfo) {
                maxLengthInfo = newLengthInfo;
            }
            numberOfBooks++;
        } else {
            throw new RuntimeException("В шкафу нет свободных мест");
        }
    }

    public void clear() {
        books = new Book[books.length];
        numberOfBooks = 0;
        maxLengthInfo = 0;
    }

    public void deleteBooks(int[] booksIndex) {
        int startIndex = booksIndex.length - 1;
        for (int i = startIndex; i >= 0; i--) {
            deleteBook(booksIndex[i]);
        }
    }

    public int[] findBooks(String findStr) {
        int[] booksIndex = new int[numberOfBooks];
        int index = 0;
        if (numberOfBooks > 0) {
            Pattern p = Pattern.compile(".*" + findStr + ".*");
            for (int i = 0; i < numberOfBooks; i++) {
                if (books[i] == null) {
                    break;
                }
                String bookInfo = books[i].toString();
                Matcher m = p.matcher(bookInfo);
                if (m.find()) {
                    booksIndex[index++] = i;
                }
            }
        }
        if (index == 0) {
            throw new RuntimeException("Ничего не найдено");
        }
        return Arrays.copyOf(booksIndex, index);
    }

    private void deleteBook(int index) {
        boolean findMaxLengthInfo = books[index].getLengthInfo() == maxLengthInfo;
        for (int i = index; i < numberOfBooks; i++) {
            if ((i + 1) == numberOfBooks) {
                books[i] = null;
                break;
            } else {
                books[i] = books[i + 1];
            }
        }
        numberOfBooks--;
        if (findMaxLengthInfo) {
            findMaxLengthInfo();
        }
    }

    private void findMaxLengthInfo() {
        maxLengthInfo = 0;
        for (int i = 0; i < numberOfBooks; i++) {
            int lenInfo = books[i].getLengthInfo();
            if (maxLengthInfo < lenInfo) {
                maxLengthInfo = lenInfo;
            }
        }
    }
}