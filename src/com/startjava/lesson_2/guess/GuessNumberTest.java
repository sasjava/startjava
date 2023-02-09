package com.startjava.lesson_2.guess;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число");
        
        System.out.print("Введите Имя 1 игрока: ");
        Player player1 = new Player(scanner.next());
        
        System.out.print("Введите Имя 2 игрока: ");
        Player player2 = new Player(scanner.next());
        
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}