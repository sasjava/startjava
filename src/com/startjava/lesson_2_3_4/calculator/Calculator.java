package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] mathExpression;

    public double calc(String mathExpressionStr) {
        mathExpression = mathExpressionStr.split(" ");
        if (mathExpression.length != 3) {
            return 0;
        }
        int num1 = Integer.parseInt(mathExpression[0]);
        int num2 = Integer.parseInt(mathExpression[2]);
        char sign = mathExpression[1].charAt(0);

        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> 0;
        };
    }
}