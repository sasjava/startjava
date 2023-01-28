public class Calculator {
    
    public static void main(String[] args) {
        int number1 = 9;
        int number2 = 4;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/') {
            result = number1 / number2;
        } else if (sign == '%') {
            result = number1 % number2;
        } else if (sign == '^') {
            for (int i = 0; i <= number2; i++) {
                if (i == 0) {
                    result = 1;
                } else {
                    result *= number1;
                }
            }
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}