package com.startjava.lesson_1.final_;

public class MyFirstGame {
    
    public static void main(String[] args) {
        int secretNum = 5;
        int min = 1;
        int max = 100;
        int playerNumber = max / 2;
        int offset = max / 2;
        int count = 0;
        while (secretNum != playerNumber) {
            count++;
            if (offset > 1) {
                offset /= 2;
            }
            System.out.print("число " + playerNumber);
            if (playerNumber > secretNum) {
                System.out.print(" больше");
                playerNumber -= offset;
            } else if (playerNumber < secretNum) {
                System.out.print(" меньше");
                playerNumber += offset;
            }
            System.out.println(" того, что загадал компьютер");
        }
        System.out.println("Вы победили! Компьютер загадал число " + secretNum);
        System.out.println("Вы угадали за " + count + " попытки!");
    }
}