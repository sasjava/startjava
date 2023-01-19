public class IfElseStatementTheme {
    public static void main(String args[]) {
        System.out.println("1.Перевод псевдокода на язык Java");
        byte age = 19;
        if (age > 20) {
            System.out.println("Adult");
        } else {
            System.out.println("Young");
        }
        boolean isMan = true;
        if(!isMan) {
            System.out.println("She's a Woman");
        } else {
            System.out.println("He's a Man");
        }
        float height = 1.80f;
        if(height < 1.80) {
            System.out.println("Low");
        } else {
            System.out.println("High");
        }
        char nameFirstLetter = "Michael".charAt(0);
        if(nameFirstLetter == 'M') {
            System.out.println("Maybe his name is Michael");
        } else if(nameFirstLetter == 'I') {
            System.out.println("Maybe his name is Igor");
        } else {
            System.out.println("His name is unknown");
        }

        System.out.println("\n2.Поиск max и min числа -------------------------------------------");
        int number1 = 8;
        int number2 = 9;
        if(number1 > number2) {
            System.out.println("Number " + number1 + " more than " + number2);
        } else if(number1 < number2) {
            System.out.println("Number " + number1 + " less than " + number2);
        } else {
            System.out.println("Number " + number1 + " equals " + number2);
        }

        System.out.println("\n3.Проверка числа --------------------------------------------------");
        int inc3 = 124;
        if (inc3 == 0) {
            System.out.println("Number " + inc3 + " is zero");
        } else if(inc3 % 2 == 0) {
            System.out.println("Number " + inc3 + " is even");
        } else {
            System.out.println("Number " + inc3 + " is odd");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах ----------------------------------");
        int inc4a = 341;
        int inc4b = 789;
        String str4а = String.valueOf(inc4a);
        String str4b = String.valueOf(inc4b);
        boolean matchFound = false;

        //char ch4a1 = str4а.toCharArray()[0];
        System.out.println("Comparing numbers: " + str4а + " and " + str4b + " ");
        for (int i = 0; i <= 2; i++) {
            char tmp4a = str4а.toCharArray()[i];
            char tmp4b = str4b.toCharArray()[i];
            if(tmp4a == tmp4b) {
                System.out.println("in both numbers the " + (i + 1) + " number digit is " + tmp4a);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No matches found");
        }

        System.out.println("\n5.Определение символа по его коду ---------------------------------");
        char inc5 = '\u0057';
        char[] lowerLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
                               'r','s','t','u','v','w','x','y','z'};
        char[] upperLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
                               'R','S','T','U','V','W','X','Y','Z'};
        char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
        boolean isFound = false;
        
        System.out.println("Symbol: " + inc5);
        for (char ch:lowerLetters) {
            if (ch == inc5) {
                System.out.println("It's LowerCase Letter");
                isFound = true;
            }
        }
        if(!isFound) {
            for (char ch:upperLetters) {
                if (ch == inc5) {
                    System.out.println("It's UpperCase Letter");
                    isFound = true;
                }
            }
            if(!isFound) {
                for (char ch:digits) {
                    if (ch == inc5) {
                        System.out.println("It's Digit");
                        isFound = true;
                    }
                }
                if(!isFound) {
                    System.out.println("It's unknown symbol");
                }
            }
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком % ---------------------");
        float deposit = 300000;
        int percent = 0;
        if (deposit < 100000) {
            percent = 5;
        } else if (deposit >= 100000 & deposit <= 300000) {
            percent = 7;
        } else if (deposit > 300000) {
            percent = 10;
        }
        float percentSum = deposit * percent / 100;
        float totalSum = deposit + percentSum;
        System.out.println("Сумма вклада " + deposit);
        System.out.println("Начисленный процент " + percentSum);
        System.out.println("Итоговая сумма " + totalSum);

        System.out.println("\n7.Определение оценки по предметам ---------------------------------");
        String [] subjects = {"История", "Программирование"};
        byte [][] results = {{59, 0}, {91, 0}};
        float averagePercent = 0;
        float averageGrade = 0;
        byte i;
        System.out.println("Оценки по предметам:");
        for (i = 0; i <= 1; i++) {
            if (results[i][0] <= 60) {
                results[i][1] = 2;
            } else if (results[i][0] > 91) {
                results[i][1] = 5;
            } else if (results[i][0] > 73) {
                results[i][1] = 4;
            } else if (results[i][0] > 60) {
                results[i][1] = 3;
            }
            System.out.println(results[i][1] + "\t" + subjects[i]);
            averagePercent += results[i][0];
            averageGrade += results[i][1];
        }
        averagePercent /= i;
        averageGrade /= i;
        System.out.println("Средний балл оценок по предметам\t" + averageGrade);
        System.out.println("Средний балл % по предметам     \t" + averagePercent);

        System.out.println("\n8.Расчет прибыли за год -------------------------------------------");
        int monthRent = 5000;
        int monthSalesIncome = 13000;
        int monthGoodsCost = 9000;
        int yearProfit = (monthSalesIncome - monthRent - monthGoodsCost) * 12;
        String yearProfitStr = Integer.toString(yearProfit);
        if (yearProfit > 0) {
            yearProfitStr = "+" + yearProfitStr;
        } 
        System.out.println("Прибыль за год: " + yearProfitStr);

        System.out.println("\n9.Подсчет количества банкнот --------------------------------------");
        int requiredSum = 567;
        int numATM100 = 1;
        int numATM10 = 2;
        int numATM1 = 460;
        int banknote100 = requiredSum / 100;
        int banknote10 = requiredSum % 100 / 10;
        int banknote1 = requiredSum % 10;
        boolean isSuccess = true;
        System.out.println("Для выдачи " + requiredSum + "$ требуется:");
        System.out.println(banknote100 + " банкнот по 100$");
        System.out.println(banknote10 + " банкнот по 10$");
        System.out.println(banknote1 + " банкнот по 1$");
        System.out.println("\nВ банкомате имеется:\n" + numATM100 + " банкнот по 100$\n" + 
            numATM10 + " банкнот по 10$\n" + numATM1 + " банкнот по 1$");
        System.out.println("Всего " + (numATM100 * 100 + numATM10 * 10 + numATM1));
        numATM100 -= banknote100;
        numATM10 -= banknote10;
        numATM1 -= banknote1;
        int tmp = 0;
        int tmpChange = 0;
        
        if (numATM100 < 0) {
            tmp = -numATM100;
            tmpChange = -numATM100 * 10;
            numATM10 -= tmpChange;
            banknote10 += tmpChange;
            numATM100 += tmp;
            banknote100 -= tmp;
        }

        if (numATM10 < 0) {
            tmp = -numATM10;
            tmpChange = -numATM10 * 10;
            numATM1 -= tmpChange;
            banknote1 += tmpChange;
            numATM10 += tmp;
            banknote10 -= tmp;
        }
        if (numATM1 < 0) {
            isSuccess = false;
        }
        if (!isSuccess) {
            System.out.println("\nСумма не может быть выдана");
        } else {
            System.out.println("\nБудет выдано:\n" + banknote100 + " банкнот по 100$\n" + 
                banknote10 + " банкнот по 10$\n" + banknote1 + " банкнот по 1$"); 
            int resultSum = banknote100 * 100 + banknote10 * 10 + banknote1;
            System.out.println("Всего сумма к выдаче: " + resultSum + "$");
            System.out.println("\nВ банкомате останется:\n" + numATM100 + " банкнот по 100$\n" + 
            numATM10 + " банкнот по 10$\n" + numATM1 + " банкнот по 1$");
        }
    }
}