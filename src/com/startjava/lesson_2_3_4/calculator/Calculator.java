package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static String[] mathExpression;

    public static double calc(String mathExpressionStr) {
        mathExpression = mathExpressionStr.split(" ");
        if (mathExpression.length != 3) {
            throw new RuntimeException("Введите выражение в формате: [число] [операция] [число]") ;
        }
        int num1 = getNum(0);
        int num2 = getNum(2);

        char sign = mathExpression[1].charAt(0);

        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> throw new RuntimeException("Операция " + sign + " не поддерживается");
        };
    }

    public static int getNum(int index) {
        int num;
        try {
            num = Integer.parseInt(mathExpression[index]);
        } catch (NumberFormatException exc) {
            throw new RuntimeException(mathExpression[index] + " не является целым числом") ;
        }
        if (num < 0) {
            throw new RuntimeException("В выражении должны участвовать только положительные целые числа") ;
        }
        return num;
    }
}