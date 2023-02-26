package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static final int TRIES_NUMBER = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nУгадай число");

        Player[] players = new Player[2];
        System.out.print("Введите Имя 1 игрока: ");
        players[0] = new Player(scanner.next());

        System.out.print("Введите Имя 2 игрока: ");
        players[1] = new Player(scanner.next());

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