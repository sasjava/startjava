package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите 1 число: ");
                calculator.setNumber1(scanner.nextInt());
                
                do {
                    System.out.print("Введите знак математической операции: ");
                } while (!calculator.setSign(scanner.next().charAt(0)));

                System.out.print("Введите 2 число: ");
                calculator.setNumber2(scanner.nextInt());
                
                System.out.println(calculator.getNumber1() + " " + calculator.getSign() + " " 
                        + calculator.getNumber2() + " = " + calculator.calc());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();
        } while (!answer.equals("no"));
    }
}