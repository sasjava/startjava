public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1.Вывод значений переменных на консоль");
        char intel = 'i'; 
        byte coreNum = 2; 
        short threadsNum = 4; 
        int freq = 2000; 
        float ramG = 7.88f; 
        double ramM = 8069.12; 
        long fileCount = (long) Math.pow(2,63); 
        boolean hasUsb = true; 
        final String delim = " = ";
        System.out.println("Характеристики ПК:");
        System.out.println("Процессор\t\t" + delim + "Core " + intel + "3-6006U");
        System.out.println("Кол-во ядер процессора\t" + delim + coreNum + "\t");
        System.out.println("Кол-во потоков\t\t" + delim + threadsNum);
        System.out.println("Частота процессора МГц\t" + delim + freq);
        System.out.println("Доступная ОП Гб\t\t" + delim + ramG);
        System.out.println("Доступная ОП Mб\t\t" + delim + ramM);
        System.out.println("Кол-во файлов на диске\t" + delim + fileCount);
        System.out.println("Наличие USB\t\t" + delim + hasUsb);

        System.out.println("\n2.Расчет стоимости товара со скидкой");
        int penPrice = 100; 
        int bookPrice = 200; 
        int discount = 11;  
        int totalPriceGoods = penPrice + bookPrice;
        float discountSum = totalPriceGoods * discount / 100;
        float discountPrice = totalPriceGoods - discountSum;
        System.out.println("Общая стоимость:\t" + totalPriceGoods);
        System.out.println("Скидка:\t\t\t" + discountSum);
        System.out.println("Итого:\t\t\t" + discountPrice);

        System.out.println("\n3.Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n4.Вывод min и max значений целых числовых типов");
        byte byteMax = 127;  
        short shortMax = 32767; 
        int intMax = (int) Math.pow(2,31); 
        long longMax = (long) Math.pow(2,63); 
        System.out.println("Тип byte:");
        System.out.println("Первоначальное значение: " + byteMax);
        byteMax++;
        System.out.println("Значения после инкремента: " + byteMax);
        System.out.println("Тип short:");
        System.out.println("Первоначальное значение: " + shortMax);
        shortMax++;
        System.out.println("Значения после инкремента: " + shortMax);
        System.out.println("Тип int:");
        System.out.println("Первоначальное значение: " + intMax);
        intMax++;
        System.out.println("Значения после инкремента: " + intMax);
        System.out.println("Тип long:");
        System.out.println("Первоначальное значение: " + longMax);
        longMax++;
        System.out.println("Значения после инкремента: " + longMax);

        System.out.println("\n5.Перестановка значений переменных");
        int number1 = 87;
        int number2 = 56;
        System.out.println("а) с помощью третьей переменной");
        System.out.println("исходные значения:\t" + number1 + "\tи\t" + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("новые значения:\t\t" + number1 + "\tи\t" + number2);

        System.out.println("б) с помощью арифметических операций");
        System.out.println("исходные значения:\t" + number1 + "\tи\t" + number2);
        number2 = (number1 += number2) - number2;
        number1 = number1 - number2;
        System.out.println("новые значения:\t\t" + number1 + "\tи\t" + number2);

        System.out.println("в) с помощью побитовой операции");
        System.out.println("исходные значения:\t" + number1 + "\tи\t" + number2);
        number1 = number1 ^ number2 ^ (number2 = number1);
        System.out.println("новые значения:\t\t" + number1 + "\tи\t" + number2);

        System.out.println("\n6.Вывод символов и их кодов");
        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println("Код символа\tСимвол");
        System.out.println((int) ch35 + "\t\t"+ ch35);
        System.out.println((int) ch38 + "\t\t"+ ch38);
        System.out.println((int) ch64 + "\t\t"+ ch64);
        System.out.println((int) ch94 + "\t\t"+ ch94);
        System.out.println((int) ch95 + "\t\t"+ ch95);

        System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("     " + slash + backSlash);
        System.out.println("    " + slash + "  " + backSlash);
        System.out.println("   " + slash + underscore + leftParenthesis + " " + rightParenthesis + backSlash);
        System.out.println("  " + slash + "      " + backSlash);
        System.out.println(" " + slash + underscore + underscore + underscore + underscore + slash + backSlash + 
                           underscore + underscore + backSlash);

        System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
        int number3 = 123;
        int ones = number3 % 10;
        int tens = (number3 / 10) % 10;
        int hundreds = number3 / 100;
        System.out.println("Число " + number3 + " содержит:");
        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десятков");
        System.out.println(ones + " единиц");
        System.out.println("Сумма его цифр = "  +  (hundreds + tens + ones) );
        System.out.println("Произведение = " + (hundreds * tens * ones) );

        System.out.println("\n9.Вывод времени"); //23:59:59
        int seconds = 86399;
        int sec = seconds % 60;
        int min = (seconds / 60) % 60;
        int hour = seconds / 60 / 60;
        //int min = (seconds - hour * 60 * 60)/60;
        //int sec = (seconds - hour * 60 * 60 - min * 60) % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
} 