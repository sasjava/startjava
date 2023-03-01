package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите математическое выражение: ");
        Scanner scanner = new Scanner(System.in);
        try {
            double result = Calculator.calc(scanner.nextLine());
            DecimalFormat dF = new DecimalFormat("#.##");
            System.out.println(dF.format(result));
        } catch (RuntimeException exc) {
            System.out.println("Введено некорректное выражение");
        }
        decideContinueEnd();
    }

    private static void decideContinueEnd() {
        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            String[] args = new String[0];
            CalculatorTest.main(args);
        } else if (answer.equals("no")) {
            return;
        } else {
            decideContinueEnd();
        }
    }
}