public class IfElseStatementTheme {

    public static void main(String[] args) {
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

        System.out.println("\n3.Проверка числа");
        int number3 = 124;
        System.out.print("Number " + number3 + " is ");
        if (number3 == 0) {
            System.out.println("zero");
        } else {
            if(number3 % 2 == 0) {
                System.out.print("even");
            } else {
                System.out.print("odd");
            }
            System.out.print(" and ");
            if (number3 > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }

        System.out.println("\n4.Поиск одинаковых цифр в числах");
        number1 = 123;
        number2 = 124;
        boolean isEqual = false;

        System.out.println("Comparing numbers: " + number1 + " and " + number2 + " ");
        int digit1 = number1 % 10;  
        int digit2 = number2 % 10;  
        if (digit1 == digit2) {
            System.out.println("in both numbers the " + 1 + " digit is " + digit1);
            isEqual = true;
        }
        digit1 = number1 / 10 % 10;  
        digit2 = number2 / 10 % 10;  
        if (digit1 == digit2) {
            System.out.println("in both numbers the " + 2 + " digit is " + digit1);
            isEqual = true;
        }
        digit1 = number1 / 10 / 10 % 10;  
        digit2 = number2 / 10 / 10 % 10;  
        if (digit1 == digit2) {
            System.out.println("in both numbers the " + 3 + " digit is " + digit1);
            isEqual = true;
        }
        if (!isEqual) {
            System.out.println("No matches found");
        }

        System.out.println("\n5.Определение символа по его коду");
        char char5 = '\u0057';
        System.out.println("Symbol: " + char5);
        if (char5 >= 'a' && char5 <= 'z') {
            System.out.println("It's LowerCase Letter");
        } else if (char5 >= 'A' && char5 <= 'Z') {
            System.out.println("It's UpperCase Letter");
        } else if (char5 >= '0' && char5 <= '9') {
            System.out.println("It's Digit");
        } else {
            System.out.println("It's unknown symbol");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");
        float deposit = 300000;
        int percent = 5;
        if (deposit >= 100000 & deposit <= 300000) {
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
        byte percentHistory = 59;
        byte percentProgramming = 91;
        byte gradeHistory = 2;
        byte gradeProgramming = 2;
        System.out.println("Оценки по предметам:");
        if (percentHistory > 91) {
            gradeHistory = 5;
        } else if (percentHistory > 73) {
            gradeHistory = 4;
        } else if (percentHistory > 60) {
            gradeHistory = 3;
        }
        if (percentProgramming > 91) {
            gradeProgramming = 5;
        } else if (percentProgramming > 73) {
            gradeProgramming = 4;
        } else if (percentProgramming > 60) {
            gradeProgramming = 3;
        }
        System.out.println(gradeHistory + "\t" + "История");
        System.out.println(gradeProgramming + "\t" + "Программирование");
        float averageGrade = (gradeHistory + gradeProgramming) / 2;
        float averagePercent = (percentHistory + percentProgramming) / 2;
        System.out.println("Средний балл оценок по предметам\t" + averageGrade);
        System.out.println("Средний балл % по предметам     \t" + averagePercent);

        System.out.println("\n8.Расчет прибыли за год");
        int monthRent = 5000;
        int monthSalesIncome = 13000;
        int monthGoodsCost = 9000;
        int yearProfit = (monthSalesIncome - monthRent - monthGoodsCost) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit);
        } else {
            System.out.println("Прибыль за год: " + yearProfit);
        } 

        System.out.println("\n9.Подсчет количества банкнот");
        int requiredSum = 567;
        int numATM100 = 3;
        int numATM10 = 4;
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
        System.out.println("Всего " + (numATM100 * 100 + numATM10 * 10 + numATM1) + "$");
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