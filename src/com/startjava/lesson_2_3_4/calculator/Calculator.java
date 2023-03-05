package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static String[] mathExpression;

    public static double calc(String mathExpressionStr) {
        mathExpression = mathExpressionStr.split(" ");
        if (mathExpression.length != 3) {
            throw new RuntimeException("Введите выражение в формате: [число] [операция] [число]") ;
        }
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(mathExpression[0]);
        } catch (NumberFormatException exc) {
            throw new RuntimeException("1 операнд не является целым числом") ;
        }
        try {
            num2 = Integer.parseInt(mathExpression[2]);
        } catch (NumberFormatException exc) {
            throw new RuntimeException("2 операнд не является целым числом") ;
        }
        if (num1 < 0 || num2 < 0) {
            throw new RuntimeException("В выражении должны участвовать только положительные целые числа") ;
        }
        char sign = mathExpression[1].charAt(0);

        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> { throw new RuntimeException("Операция " + sign + " не поддерживается"); }
        };
    }
}