public class Calculator {
    private int number1 ;
    private int number2;
    private char sign;
    private int result; 

    public void setNumber1(int number) {
        number1 = number;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number) {
        number2 = number;
    }

    public int getNumber2() {
        return number2;
    }

    public boolean setSign(char sign) {
        if (sign == '+' || sign == '-' || sign == '*' || sign == '/' || sign == '%' || 
                sign == '^') {
            this.sign = sign;
            return true;
        } else {
            return false;
        }
    }

    public char getSign() {
        return sign;
    }

    public int getResult() {
        return result;
    }

    public int calc() {
        switch(sign) { 
            case '+':
                result = number1 + number2;
                break;
            case '-' :
                result = number1 - number2;
                break;
            case '*' : 
                result = number1 * number2;
                break;
            case '/' : 
                result = number1 / number2;
                break;
            case '%' : 
                result = number1 % number2;
                break;
            case '^' : 
                for (int i = 0; i <= number2; i++) {
                    if (i == 0) {
                        result = 1;
                    } else {
                        result *= number1;
                    }
                }
                break;
            default:
                return 0;
        }
        return result;
    }
}