package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int ROUNDS_NUMBER = 3;
    private final Player[] players;
    private int secretNum;
    private int roundNum;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void play() {
        System.out.println("\nУ каждого игрока по " + Player.TRIES_NUMBER + " попыток");
        drawLot();
        playRound();
    }

    public void playRound() {
        initializeRound();
        System.out.println("\n" + roundNum + "раунд");
        int currentNum = 0;
        boolean isEqual;
        do {
            input_number(currentNum);
            isEqual = checkNumber(players[currentNum].getNumber());
            if (isEqual) {
                players[currentNum].upScore();
                break;
            } else {
                currentNum = nextPlayerNum(currentNum);
            }
        } while (!players[currentNum].isLastTry());

        System.out.println((isEqual) ? "Игрок " + players[currentNum].getName() + " угадал число " + secretNum +
                " c " + players[currentNum].getCurrentTryNum() + " попытки!!!\n"
                : "У " + players[currentNum].getName() + " закончились попытки\n");
        secretNum = 0;
        for (Player player : players) {
            printPlayerNumbers(player);
        }
        if (roundNum == ROUNDS_NUMBER) {
            Player winner = getWinner();
            System.out.printf("По результатам " + roundNum + " раундов %s\n",
                    (winner != null) ? "победил игрок " + winner.getName() : "победитель не выявлен");
        } else {
            playRound();
        }
    }

    private void initializeRound() {
        roundNum = (roundNum < ROUNDS_NUMBER) ? roundNum + 1 : 1;
        for (Player player : players) {
            player.clear_numbers();
            if (roundNum == 1) {
                player.setScore(0);
            }
        }
        doRandomNum();
    }

    private void drawLot() {
        Random random = new Random();
        int maxIndex = players.length;
        while (--maxIndex > 0) {
            int randomIndex = random.nextInt(maxIndex);
            Player tmpPlayer = players[maxIndex];
            players[maxIndex] = players[randomIndex];
            players[randomIndex] = tmpPlayer;
        }
    }

    private void doRandomNum() {
        Random random = new Random();
        secretNum = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        System.out.println("secretNum = " + secretNum);
    }

    private boolean checkNumber(int number) {
        boolean check = secretNum == number;
        if (!check) {
            System.out.printf("Это число %s загаданного\n", (secretNum < number) ? "больше" : "меньше");
        }
        return check;
    }

    private int nextPlayerNum(int num) {
        return (num < players.length - 1) ? num + 1 : 0;
    }

    private void printPlayerNumbers(Player player) {
        int[] numbers = player.getNumbers();
        System.out.print("Числа игрока " + player.getName() + ": ");
        for (int item : numbers) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
    private Player getWinner() {
        int maxScore = players[0].getScore();
        for (int i = 1; i < players.length; i++) {
            maxScore = Math.max(players[i].getScore(), maxScore);
        }
        Player winner = null;
        int count = 0;
        for (Player player : players ) {
            if (player.getScore() == maxScore) {
                winner = player;
                count++;
            }
        }
        if (count > 1) {
            winner = null;
        }
        return winner;
    }

    private void input_number(int index) {
        System.out.print(players[index].getName() + ", введите число от " + MIN_NUMBER +
                " до " + MAX_NUMBER + ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            players[index].addNumber(scanner.nextInt());
        } catch (RuntimeException exc) {
            input_number(index);
        }
    }
}