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

        System.out.println("\n2.Поиск max и min числа");
        int number1 = 8;
        int number2 = 9;
        if(number1 > number2) {
            System.out.println("Number " + number1 + " more than " + number2);
        } else if(number1 < number2) {
            System.out.println("Number " + number1 + " less than " + number2);
        } else {
            System.out.println("Number " + number1 + " equals " + number2);
        }

        System.out.println("\n3.Проверка числа-------");
        int number3 = 124;
        if (number3 == 0) {
            System.out.println("Number " + number3 + " is zero");
        } else if(number3 % 2 == 0) {
            System.out.println("Number " + number3 + " is even");
        } else {
            System.out.println("Number " + number3 + " is odd");
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        int numberA = 389;
        int numberB = 568;
        boolean matchFound = false;

        System.out.println("Comparing numbers: " + numberA + " and " + numberB + " ");
        for (int i = 0; i <= 2; i++) {
            int digitA = numberA / (int) Math.pow(10,i) % 10;
            int digitB = numberB / (int) Math.pow(10,i) % 10;
            if (digitA == digitB) {
                System.out.println("in both numbers the " + (i + 1) + " digit is " + digitA);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No matches found");
        }

        System.out.println("\n5.Определение символа по его коду");
        char char5 = '\u0057';
        System.out.println("Symbol: " + char5);
        switch (char5) {
            case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                    't','u','v','w','x','y','z' ->
                System.out.println("Symbol: " + char5);
            case 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
                    'T','U','V','W','X','Y','Z' ->
                System.out.println("It's UpperCase Letter");
            case '0','1','2','3','4','5','6','7','8','9' ->
                System.out.println("It's Digit");
            default -> System.out.println("It's unknown symbol");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
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

        System.out.println("\n7.Определение оценки по предметам");
        final String history = "История";
        final String programming = "Программирование";
        byte percHistory = 59;
        byte percProgramming = 91;
        byte gradeHistory = 0;
        byte gradeProgramming = 0;
        System.out.println("Оценки по предметам:");
        if (percHistory <= 60) {
            gradeHistory = 2;
        } else if (percHistory > 91) {
            gradeHistory = 5;
        } else if (percHistory > 73) {
            gradeHistory = 4;
        } else if (percHistory > 60) {
            gradeHistory = 3;
        }
        if (percProgramming <= 60) {
            gradeProgramming = 2;
        } else if (percProgramming > 91) {
            gradeProgramming = 5;
        } else if (percProgramming > 73) {
            gradeProgramming = 4;
        } else if (percProgramming > 60) {
            gradeProgramming = 3;
        }
        System.out.println(gradeHistory + "\t" + history);
        System.out.println(gradeProgramming + "\t" + programming);
        float averageGrade = (gradeHistory + gradeProgramming) / 2;
        float averagePercent = (percHistory + percProgramming) / 2;
        System.out.println("Средний балл оценок по предметам\t" + averageGrade);
        System.out.println("Средний балл % по предметам     \t" + averagePercent);

        System.out.println("\n8.Расчет прибыли за год");
        int monthRent = 5000;
        int monthSalesIncome = 13000;
        int monthGoodsCost = 9000;
        int yearProfit = (monthSalesIncome - monthRent - monthGoodsCost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit);
        } else {
            System.out.println("Прибыль за год: " + yearProfit);
        } 

        System.out.println("\n9.Подсчет количества банкнот");
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