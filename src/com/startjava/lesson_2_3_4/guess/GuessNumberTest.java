package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest{
    public static final int TRIES_NUMBER = 5;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 100;
    public static final int PLAYERS_NUMBER = 3;
    public static final int ROUNDS_NUMBER = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nУгадай число");

        Player[] players = new Player[PLAYERS_NUMBER];

        for (int i = 0; i < PLAYERS_NUMBER; i++) {
            System.out.print("Введите Имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.next());
        }
        runGame(players);
    }

    private static void runGame(Player... players) {
        GuessNumber game = new GuessNumber(players);
        game.play();

        System.out.print("Хотите продолжить игру? [yes/no]: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("yes")) {
            runGame(players);
        }
    }
}