package com.startjava.lesson_2_3_4.calculator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.print("Введите математическое выражение: ");
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.setMathExpression(scanner.nextLine());
        double result = calculator.calc();

        DecimalFormat dF = new DecimalFormat( "#.##" );
        System.out.println(dF.format(result));

        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            CalculatorTest.main(args);
        }
    }
}