package com.startjava.lesson_1.base;

public class MyFirstApp {
    
    public static void main(String[] args) {
        char symbol = (char) 33;
        char symbolLast = (char) 126;
        while (symbol != symbolLast) {
            System.out.print(symbol);
            symbol++;
        }
        System.out.println();
        symbol = (char) 9298;
        symbolLast = (char) 10178;
        while (symbol != symbolLast) {
            System.out.print(symbol);
            symbol++;
        }
    }
}