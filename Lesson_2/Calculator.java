public class Calculator {
    private int number1 ;
    private int number2;
    private char sign;
    private int result = 0; 

    public void setNumber1(int number) {
        number1 = number;
    }
    public void setNumber2(int number) {
        number2 = number;
    }
    public boolean setSign(char sign) {
        switch(sign) {
            case '+', '-', '*', '/', '%', '^':
                this.sign = sign;
                return true;
            default:
                return false;
        }
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }
    public char getSign() {
        return sign;
    }
    public int getResult() {
        return result;
    }
    public boolean run() {
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
                return false;
        }
        return true;
    }
}