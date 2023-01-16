public class VariablesTheme {

    public static void main(String[] args) {
    System.out.println("1.Вывод значений переменных на консоль");
    char intel = 'i'; 
    byte coreNum = 2; 
    short threadsNum = 4; 
    int freq = 2000; 
    float ramG = 7.88f; 
    double ramM = 8069.12; 
    long fileCnt = (long) Math.pow(2,63); 
    boolean hasUsb = true; 
    char delim = '=';
    System.out.println("Характеристики ПК:");
    System.out.println("Процессор\t\t" + delim + " Core " + intel + "3-6006U");
    System.out.println("Кол-во ядер процессора\t" + delim + " " + coreNum + "\t");
    System.out.println("Кол-во потоков\t\t" + delim + " " + threadsNum);
    System.out.println("Частота процессора МГц\t" + delim + " " + freq);
    System.out.println("Доступная ОП Гб\t\t" + delim + " " + ramG);
    System.out.println("Доступная ОП Mб\t\t" + delim + " " + ramM);
    System.out.println("Кол-во файлов на диске\t" + delim + " " + fileCnt);
    System.out.println("Наличие USB\t\t" + delim + " " + hasUsb);

    System.out.println("\n2.Расчет стоимости товара со скидкой");
    int penPrice = 100; 
    int bookPrice = 200; 
    int discount = 11;  
    int sumPrice = penPrice + bookPrice;
    float totalDiscount = sumPrice * discount / 100;
    float totalCost = sumPrice - totalDiscount;
    System.out.println("Общая стоимость:\t" + sumPrice);
    System.out.println("Скидка:\t\t\t" + totalDiscount);
    System.out.println("Итого:\t\t\t" + totalCost);

    System.out.println("\n3.Вывод слова JAVA");
    String str = "    J    a  v     v  a";
    System.out.println(str);
    str = "    J   a a  v   v  a a";
    System.out.println(str);
    str = " J  J  aaaaa  V V  aaaaa";
    System.out.println(str);
    str = "  JJ  a     a  V  a     a";
    System.out.println(str);

    System.out.println("\n4.Вывод min и max значений целых числовых типов");
    byte inc4B = 127;  
    short inc4S = 32767; 
    int inc4I = (int) Math.pow(2,31); 
    long inc4L = (long) Math.pow(2,63); 
    String delim4 = "\n";
    System.out.println("Первоначальные значения:");
    System.out.print(inc4B + delim4 + inc4S + delim4 + inc4I + delim4 + inc4L + delim4);
    System.out.println("Значения после инкремента:");
    inc4B++; inc4S++; inc4I++; inc4L++;
    System.out.print(inc4B + delim4 + inc4S + delim4 + inc4I + delim4 + inc4L + delim4);
    System.out.println("Значения после декремента:");
    inc4B--; inc4S--; inc4I--; inc4L--;
    System.out.print(inc4B + delim4 + inc4S + delim4 + inc4I + delim4 + inc4L + delim4);

    System.out.println("\n5.Перестановка значений переменных");
    int inc5_1 = 87;
    int inc5_2 = 56;
    System.out.println("а) с помощью третьей переменной");
    System.out.println("исходные значения:\t" + inc5_1 + "\tи\t" + inc5_2);
    int tmp5 = inc5_1;
    inc5_1 = inc5_2;
    inc5_2 = tmp5;
    System.out.println("новые значения:\t\t" + inc5_1 + "\tи\t" + inc5_2);

    System.out.println("б) с помощью арифметических операций");
    System.out.println("исходные значения:\t" + inc5_1 + "\tи\t" + inc5_2);
    tmp5 = inc5_1 - inc5_2;
    inc5_1 -= tmp5;
    inc5_2 += tmp5;
    System.out.println("новые значения:\t\t" + inc5_1 + "\tи\t" + inc5_2);

    System.out.println("в) с помощью побитовой операции");
    System.out.println("исходные значения:\t" + inc5_1 + "\tи\t" + inc5_2);
    tmp5 = inc5_1 ^ inc5_2;
    inc5_1 ^= tmp5;
    inc5_2 ^= tmp5;
    System.out.println("новые значения:\t\t" + inc5_1 + "\tи\t" + inc5_2);

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
    char ch7_1 = '/';
    char ch7_2 = '\\';
    char ch7_3 = '_';
    char ch7_4 = '(';
    char ch7_5 = ')';
    System.out.println("     " + ch7_1 + ch7_2);
    System.out.println("    " + ch7_1 + "  " + ch7_2);
    System.out.println("   " + ch7_1 + ch7_3 + ch7_4 + " " + ch7_5 + ch7_2);
    System.out.println("  " + ch7_1 + "      " + ch7_2);
    System.out.println(" " + ch7_1 + ch7_3 + ch7_3 + ch7_3 + ch7_3 + ch7_1 + ch7_2 + 
                       "__" + ch7_2);

    System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
    int inc8 = 123;
    int hundreds = inc8 / 100;
    int tens = (inc8 - hundreds * 100) / 10;
    int ones = (inc8 - hundreds * 100 - tens * 10) % 10;
    System.out.println("Число " + inc8 + " содержит:");
    System.out.println(hundreds + " сотен");
    System.out.println(tens + " десятков");
    System.out.println(ones + " единиц");
    System.out.println("Сумма его цифр = "  +  (hundreds + tens + ones) );
    System.out.println("Произведение = " + (hundreds * tens * ones) );

    System.out.println("\n9.Вывод времени");
    int seconds = 86399;
    int hour = seconds / 60 / 60;
    int min = (seconds - hour * 60 * 60)/60;
    int sec = (seconds - hour * 60 * 60 - min * 60) % 60;
    System.out.println(hour + ":" + min + ":" + sec);
    }
} 