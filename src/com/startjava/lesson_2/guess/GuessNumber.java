package com.startjava.lesson_2.guess;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    
    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        doRandomNum();
        Player currentPlayer = player1;
        do {
            System.out.print(currentPlayer.getName() + ", введите число от 1 до 100: ");
            currentPlayer.setNumber(scanner.nextInt());
            
            if (secretNum < currentPlayer.getNumber()) {
                System.out.println("Это число больше загаданного");
            } else if(secretNum > currentPlayer.getNumber()) {
                System.out.println("Это число меньше загаданного");
            } else {
                break;
            }
            currentPlayer = selectNextPlayer(currentPlayer);
        } while (true);

        System.out.print("Игрок " + currentPlayer.getName() + " угадал число!!!");
        secretNum = 0;
    }

    private void doRandomNum() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
        //System.out.println("secretNum = " + secretNum);
    }

    private Player selectNextPlayer(Player player) {
        return (player == player1) ? player2 : player1;
    }
}