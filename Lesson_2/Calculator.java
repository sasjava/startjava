public class Calculator {
    private int number1 ;
    private int number2;
    private char sign;

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
        } 
        return false;
    }

    public char getSign() {
        return sign;
    }

    public int calc() {
        int result = 1;
        switch(sign) { 
            case '+':
                return number1 + number2;
            case '-' :
                return number1 - number2;
            case '*' : 
                return number1 * number2;
            case '/' : 
                return number1 / number2;
            case '%' : 
                return number1 % number2;
            case '^' : 
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                return result;
        }
        return 0;
    }
}