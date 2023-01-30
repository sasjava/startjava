public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int evenSum = 0;
        int oddSum = 0;
        int counter = startRange;
        while(counter <= endRange) {
            if(counter % 2 == 0) {
                evenSum += counter;
            } else {
                oddSum += counter; 
            }
            counter++;
        }
        System.out.println("в промежутке [" + startRange + "," + endRange + "] сумма четных чисел = " + 
                evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n2.Вывод чисел в интервале (min и max) в порядке убывания");
        int number3 = 10;
        int number4 = 5;
        int number5 = -1;
        int max = number3;
        int min = number3;
        if (min > number4) {
            min = number4;
        }
        if (min > number5) {
            min = number5;
        }
        if (max < number4) {
            max = number4;
        }
        if (max < number5) {
            max = number5;
        }
        System.out.println("Min = " + min + "; Max = " + max);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int number6 = 1234;
        int sumDigit = 0;
        System.out.println("Исходное число: " + number6);
        System.out.print("Реверсия:\t");
        while (number6 > 0) {
            int digit = number6 % 10;
            System.out.print(digit);
            number6 /= 10;
            sumDigit += digit;
        }
        System.out.println("\nСумма цифр: " + sumDigit);

        System.out.println("\n4.Вывод чисел на консоль в несколько строк");
        startRange = 1;
        endRange = 24;
        int count = 0;
        for (int i = startRange; i < endRange; i += 2) {
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

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность");
        int number7 = 3242592;
        int countTwos = 0;
        System.out.print("Число " + number7);
        while (number7 > 0) {
            int digit = number7 % 10; 
            number7 /= 10;
            if (digit == 2) {
                countTwos++;
            }
        }
        if (countTwos == 0) {
            System.out.print(" не содержит");
        } else {
            System.out.print(" содержит");
            if (countTwos % 2 == 0) {
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
        System.out.println();

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
        System.out.println();

        length = 1;
        count = 1;
        int countRow = 1;
        do {
            do {
                System.out.print('$');
                count++;
            } while (count <= length);
            System.out.println();
            count = 1;
            if (countRow < 3) {
                length++;
            } else {
                length--;
            }
            countRow++;
        } while (countRow < 6);

        System.out.println("\n7.Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (int i = 1; i <= 127; i++) {
            boolean check1 = i < (int) '0' && i % 2 != 0;
            boolean check2 = i >= (int) 'a' && i <= (int) 'z' && i % 2 == 0;
            if (check1 || check2) {
                System.out.printf("%6d%6s %n", i, (char) i);
            }
        }

        System.out.println("\n8.Проверка, является ли число палиндромом");
        int number = 1234321;
        int reverse = 0;
        int copyNumber = number;
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            reverse = reverse * 10 + digit;
            copyNumber /= 10;
        }
        System.out.print("Число " + number);
        if (number != reverse) {
            System.out.print(" не");
        }
        System.out.println(" является палиндромом");

        System.out.println("\n9.Определение, является ли число счастливым");
        int number9 = 123312;
        int sumLeft = 0;
        int sumRight = 0;
        int copyNumber9 = number9;
        for (int i = 1; i <= 6; i++) {
            int digit = copyNumber9 % 10;
            copyNumber9 /= 10;
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