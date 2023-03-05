package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                Scanner scanner = new Scanner(System.in);
                try {
                    double result = Calculator.calc(scanner.nextLine());
                    DecimalFormat dF = new DecimalFormat("#.##");
                    System.out.println(dF.format(result));
                } catch (RuntimeException exc) {
                    System.out.println(exc.getMessage());
                    continue;
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}