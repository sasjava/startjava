package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                try {
                    double result = Calculator.calc(scanner.nextLine());
                    DecimalFormat dF = new DecimalFormat("#.##");
                    System.out.println(dF.format(result));
                } catch (RuntimeException ex) {
                    System.out.println(ex.getMessage());
                    continue;
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}