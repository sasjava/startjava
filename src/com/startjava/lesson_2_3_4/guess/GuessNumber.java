package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;
    private int secretNum;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void play() {
        initializeGame();
        System.out.println("\nУ каждого игрока по " + GuessNumberTest.TRIES_NUMBER + " попыток");
        Scanner scanner = new Scanner(System.in);
        doRandomNum();
        Player currentPlayer = players[0];
//        int currentNumber = 0;
        boolean isEqual;
        do {
            System.out.print(currentPlayer.getName() + ", введите число от 1 до 100: ");
            currentPlayer.setNumber(scanner.nextInt());

            isEqual = checkNumber(currentPlayer.getNumber());
            if (isEqual) {
                break;
            } else {
                currentPlayer = selectNextPlayer(currentPlayer);
            }
        } while (currentPlayer.getCurrentTryNum() >= 0);

        System.out.println((isEqual) ? "Игрок " + currentPlayer.getName() + " угадал число " + secretNum +
                " c " + currentPlayer.getCurrentTryNum() + " попытки!!!\n"
                : "У " + currentPlayer.getName() + " закончились попытки\n");
        secretNum = 0;
        for (Player player : players) {
            printPlayerNumbers(player);
        }
    }

    private void initializeGame() {
        for (Player player : players) {
            player.clear_numbers();
        }
    }

    private void doRandomNum() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
        System.out.println("secretNum = " + secretNum);
    }

    private boolean checkNumber(int number) {
        System.out.print((secretNum < number) ?"Это число больше загаданного\n"
                : (secretNum > number) ? "Это число меньше загаданного\n" : "");
        return secretNum == number;
    }

    private Player selectNextPlayer(Player player) {
        return (player == players[0]) ? players[1] : players[0];
    }

    private void printPlayerNumbers(Player player) {
        int[] numbers = player.getNumbers();
        System.out.print("Числа игрока " + player.getName() + ": ");
        for (int item : numbers) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}