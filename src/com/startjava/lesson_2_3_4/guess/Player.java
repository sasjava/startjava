package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int TRIES_NUMBER = 5;
    private final String name;
    private final int[] numbers;
    private int score;
    private int currentTryNum = 0;

    public Player(String name) {
        this.name = name;
        numbers = new int[TRIES_NUMBER];
    }

    public String getName() {
        return name;
    }

    public int getCurrentTryNum() {
        return currentTryNum;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, (currentTryNum >= 0) ? currentTryNum : numbers.length);
    }

    public int getNumber() {
        int i = currentTryNum;
        i = (i > 0) ? i - 1 : (i < 0) ? numbers.length - 1 : i;
        return numbers[i];
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void upScore() {
        score++;
    }

    public void addNumber(int number) {
        if (number < GuessNumber.MIN_NUMBER || number > GuessNumber.MAX_NUMBER) {
            throw new RuntimeException("Вы ввели неправильное число!") ;
        }
        int i = currentTryNum;
        if (i >= 0 && i < numbers.length) {
            numbers[i] = number;
            currentTryNum++;
        }
    }

    public void clear_numbers() {
        if (currentTryNum > 0) {
            Arrays.fill(numbers, 0, currentTryNum, 0);
        }
        currentTryNum = 0;
    }

    public boolean isLastTry() {
        return (currentTryNum == TRIES_NUMBER);
    }
}