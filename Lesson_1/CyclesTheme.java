public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int number1 = -10;
        int number2 = 21;
        int evenNumbers = 0;
        int oddNumbers = 0;
        int curNumber = number1;
        while(curNumber <= number2) {
            if(curNumber % 2 == 0) {
                evenNumbers += curNumber;
            } else {
                oddNumbers += curNumber; 
            }
            curNumber++;
        }
        System.out.println("в промежутке [" + number1 + "," + number2 + "] сумма четных чисел = " + 
                evenNumbers + ", а нечетных = " + oddNumbers);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int number3 = 10;
        int number4 = 5;
        int number5 = -1;
        int maxNum = number3;
        int minNum = number3;
        if (minNum > number4) {
            minNum = number4;
        }
        if (minNum > number5) {
            minNum = number5;
        }
        if (maxNum < number4) {
            maxNum = number4;
        }
        if (maxNum < number5) {
            maxNum = number5;
        }
        System.out.println("Min = " + minNum + "; Max = " + maxNum);
        for (int i = 1; i < maxNum - minNum; i++) {
            System.out.print(maxNum - i);
            if (i < maxNum - minNum -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int number6 = 1234;
        int digit = 0;
        int digitSum = 0;
        System.out.println("Исходное число: " + number6);
        System.out.print("Реверсия:\t");
        while (number6 > 0) {
            digit = number6 % 10;
            System.out.print(digit);
            number6 /= 10;
            digitSum += digit;
        }
        System.out.println("\nСумма цифр: " + digitSum);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        int numBegin = 1;
        int numEnd = 24;
        int count = 0;
        for (int i = numBegin; i < numEnd; i += 2) {
            count++;
            if (count > 5) {
                System.out.println();
                count = 1; 
            }
            System.out.printf("%3d", i); 
        }
        for (int i = count; count < 5; count++) {
            System.out.printf("%3d", 0); 
        }

        System.out.println("\n5.Проверка количества двоек на четность/нечетность");
        int number7 = 3242592;
        int count2 = 0;
        System.out.print("Число " + number7);
        while (number7 > 0) {
            digit = number7 % 10; 
            number7 /= 10;
            if (digit == 2) {
                count2++;
            }
        }
        if (count2 == 0) {
            System.out.print(" не содержит");
        } else 
        {   System.out.print(" содержит");
            if (count2 % 2 == 0) {
                System.out.print(" четное");
            } else {
                System.out.print(" нечетное");
            } 
            System.out.print(" количество");
        }
        System.out.println(" двоек");

        System.out.println("\n6.Отображение фигур в консоли");
        count = 1;
        int length = 10;
        for (int i = 0; i < 50; i++) {
            System.out.print('*');
            count++;
            if (count > length) {
                System.out.println();
                count = 1;
            }
        }
        length = 5;
        count = 1;
        while (length > 0) {
            System.out.print('#');
            count++;
            if (count > length) {
                System.out.println();
                count = 1;
                length--;
            }
        }
        length = 1;
        count = 1;
        do {
            System.out.print('$');
            count++;
            if (count > length) {
                System.out.println();
                count = 1;
                length++;
            }
        } while (length <= 3);
        length = 2;
        count = 1;
        do {
            System.out.print('$');
            count++;
            if (count > length) {
                System.out.println();
                count = 1;
                length--;
            }
        } while (length > 0);

        System.out.println("\n7.Отображение ASCII-символов");
        char ch = 'i'; 
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (int i = 1; i <= 127; i++) {
            boolean check1 = i < (int) '0' && i % 2 != 0;
            boolean check2 = i >= (int) 'a' && i <= (int) 'z' && i % 2 == 0;
            if (check1 || check2) {
                System.out.printf("%6d%6s %n", i, (char) i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int numberForward = 1234321;
        int numberBackward = 0;
        int decimalPlace = 1;
        int tmp = numberForward;
        while (tmp > 0) {
            tmp /= 10;
            decimalPlace *= 10;
        }
        tmp = numberForward;
        while (tmp > 0) {
            digit = tmp % 10;
            decimalPlace /= 10; 
            numberBackward = numberBackward + digit * decimalPlace;
            tmp /= 10;
        }
        System.out.print("Число " + numberForward);
        if (numberForward != numberBackward) {
            System.out.print(" не");
        }
        System.out.println(" является палиндромом");

        System.out.println("\n9.Определение, является ли число счастливым");
        int number9 = 123312;
        int sumLeft = 0;
        int sumRight = 0;
        tmp = number9;
        for (int i = 1; i <= 6; i++) {
            digit = tmp % 10;
            tmp /= 10;
            if (i <= 3) {
                sumRight += digit;
            } else {
                sumLeft += digit;
            }
        }
        System.out.println("Сумма цифр " + number9 / 1000 + " = " + sumLeft);
        System.out.println("Сумма цифр " + number9 % 1000 + " = " + sumRight);
        System.out.print("Число " + number9);
        if (sumLeft != sumRight) {
            System.out.print(" не");
        }
        System.out.println(" является счастливым");

        System.out.println("\n10.Вывод таблицы умножения Пифагора");
        boolean flagHorizontal = true;
        for (int i = 1; i <= 9; i++) {
            boolean flagVertical = true;
            for (int j = 1; j <= 9; j++) {
                if ( j == 2 && flagVertical ) {
                    System.out.print("|");
                    j--;
                    flagVertical = false;
                } else if (i == 2 && flagHorizontal) {
                    System.out.printf("%5s", "-----");
                    if (j == 9) {
                        System.out.print("-");
                    }
                } else {
                    System.out.printf("%5d", i * j);
                }
                if (j == 9) {
                    System.out.println( );
                }
            }
            if (i == 2 && flagHorizontal) {
                i--;
                flagHorizontal = false;
            }
        }
    }
}