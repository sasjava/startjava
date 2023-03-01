package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private final String name;
    private final int[] numbers;
    private int score;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumberTest.TRIES_NUMBER];
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if (number < GuessNumberTest.MIN_NUMBER || number > GuessNumberTest.MAX_NUMBER) {
            System.out.println("Вы ввели неправильное число!");
            throw new RuntimeException() ;
        };
        int i = getCurrentTryNum();
        if (i >= 0 && i < numbers.length) {
            numbers[i] = number;
        }
    }

    public int[] getNumbers() {
        int i = getCurrentTryNum();
        return Arrays.copyOf(numbers, (i >= 0) ? i : numbers.length);
    }

    public int getNumber() {
        int i = getCurrentTryNum();
        i = (i > 0) ? i - 1 : (i < 0) ? numbers.length - 1 : i;
        return numbers[i];
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void addScore() {
        score++;
    }

    public int getCurrentTryNum() {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public void input_number() {
        System.out.print(getName() + ", введите число от " + GuessNumberTest.MIN_NUMBER +
                " до " + GuessNumberTest.MAX_NUMBER + ": ");
        Scanner scanner = new Scanner(System.in);
        try {
            setNumber(scanner.nextInt());
        } catch (RuntimeException exc) {
            input_number();
        }
    }

    public void clear_numbers() {
        int i = getCurrentTryNum();
        if (i > 0) {
            Arrays.fill(numbers, 0, i, 0);
        }
    }
}