package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest{
    public static final int PLAYERS_NUMBER = 3;

    public static void main(String[] args) {
        System.out.println("\nУгадай число");
        runGame(createPlayers());
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

    private static Player[] createPlayers() {
        Scanner scanner = new Scanner(System.in);
        Player[] players = new Player[PLAYERS_NUMBER];

        for (int i = 0; i < PLAYERS_NUMBER; i++) {
            System.out.print("Введите Имя " + (i + 1) + " игрока: ");
            players[i] = new Player(scanner.next());
        }
        return players;
    }
}