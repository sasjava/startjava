public class VariablesTheme {

	public static void main(String[] args) {
//=================================================================
	System.out.println("1.Вывод значений переменных на консоль");
//=================================================================
	char c = 'i'; 
	byte coreNum = 2;  //Кол-во ядер процессора
	short threadsNum = 4; //Кол-во потоков
	int freq = 2000; //Частота процессора МГц
	float ram_g = 7.88f; // Доступная ОП Гб
	double ram_m = 8069.12; //Доступная ОП Mб
	long fileCnt = (long)Math.pow(2,63); //Кол-во файлов на диске
	boolean has_usb = true; //Наличие USB
	char delim = '=';
	System.out.println("Характеристики ПК:");
	System.out.println("Процессор\t\t"+delim+" Core "+c+"3-6006U");
	System.out.println("Кол-во ядер процессора\t"+delim+" "+coreNum+"\t");
	System.out.println("Кол-во потоков\t\t"+delim+" "+threadsNum);
	System.out.println("Частота процессора МГц\t"+delim+" "+freq);
	System.out.println("Доступная ОП Гб\t\t"+delim+" "+ram_g);
	System.out.println("Доступная ОП Mб\t\t"+delim+" "+ram_m);
	System.out.println("Кол-во файлов на диске\t"+delim+" "+fileCnt);
	System.out.println("Наличие USB\t\t"+delim+" "+has_usb);

//=================================================================
	System.out.println("\n2.Расчет стоимости товара со скидкой");
//=================================================================
	int pen_price = 100; //Цена ручки
	int book_price = 200; //Цена книги
	int discount = 11;  //Скидка %
	int sum_price = pen_price + book_price;
	float total_discount = sum_price * discount / 100;
	float total_cost = sum_price - total_discount;
	System.out.println("Общая стоимость:\t"+sum_price);
	System.out.println("Скидка:\t\t\t"+total_discount);
	System.out.println("Итого:\t\t\t"+total_cost);

//=================================================================
	System.out.println("\n3.Вывод слова JAVA");
//=================================================================
//    J    a  v     v  a                                                  
//    J   a a  v   v  a a                                                 
// J  J  aaaaa  V V  aaaaa                                                
//  JJ  a     a  V  a     a
	String str = "    J    a  v     v  a";
	System.out.println(str);
	str = "    J   a a  v   v  a a";
	System.out.println(str);
	str = " J  J  aaaaa  V V  aaaaa";
	System.out.println(str);
	str = "  JJ  a     a  V  a     a";
	System.out.println(str);

//=================================================================
	System.out.println("\n4.Вывод min и max значений целых числовых типов");
//=================================================================
	byte b4 = 127;  
	short s4 = 32767; 
	int i4 = (int)Math.pow(2,31); 
	long ln4 = (long)Math.pow(2,63); 
	String delim4 = "\n";
	System.out.println("Первоначальные значения:");
	System.out.print(b4+delim4+s4+delim4+i4+delim4+ln4+delim4);
	System.out.println("Значения после инкремента:");
	b4++; s4++; i4++; ln4++;
	System.out.print(b4+delim4+s4+delim4+i4+delim4+ln4+delim4);
	System.out.println("Значения после декремента:");
	b4--; s4--; i4--; ln4--;
	System.out.print(b4+delim4+s4+delim4+i4+delim4+ln4+delim4);

//=================================================================
	System.out.println("\n5.Перестановка значений переменных");
//=================================================================
	int i5_1 = 87;
	int i5_2 = 56;
	System.out.println("а) с помощью третьей переменной");
	System.out.println("исходные значения:\t"+i5_1+"\tи\t"+i5_2);
	int tmp5 = i5_1;
	i5_1 = i5_2;
	i5_2 = tmp5;
	System.out.println("новые значения:\t\t"+i5_1+"\tи\t"+i5_2);

	System.out.println("б) с помощью арифметических операций");
	System.out.println("исходные значения:\t"+i5_1+"\tи\t"+i5_2);
	tmp5 = i5_1 - i5_2;
	i5_1 -= tmp5;
	i5_2 += tmp5;
	System.out.println("новые значения:\t\t"+i5_1+"\tи\t"+i5_2);

	System.out.println("в) с помощью побитовой операции");
	System.out.println("исходные значения:\t"+i5_1+"\tи\t"+i5_2);
	tmp5 = i5_1 ^ i5_2;
	i5_1 ^= tmp5;
	i5_2 ^= tmp5;
	System.out.println("новые значения:\t\t"+i5_1+"\tи\t"+i5_2);

//=================================================================
	System.out.println("\n6.Вывод символов и их кодов");
//=================================================================
	char ch35 = '#';
	char ch38 = '&';
	char ch64 = '@';
	char ch94 = '^';
	char ch95 = '_';
	System.out.println("Код символа\tСимвол");
	System.out.println((int)ch35+"\t\t"+ch35);
	System.out.println((int)ch38+"\t\t"+ch38);
	System.out.println((int)ch64+"\t\t"+ch64);
	System.out.println((int)ch94+"\t\t"+ch94);
	System.out.println((int)ch95+"\t\t"+ch95);

//=================================================================
	System.out.println("\n7.Вывод в консоль ASCII-арт Дюка");
//=================================================================
//     /\                                                                                                                                       
//    /  \                                                                                                                                      
//   /_( )\                                                                                                                                     
//  /      \                                                                                                                                    
// /____/\__\
	char ch7_1 = '/';
	char ch7_2 = '\\';
	char ch7_3 = '_';
	char ch7_4 = '(';
	char ch7_5 = ')';
	System.out.println("     "+ch7_1+ch7_2);
	System.out.println("    "+ch7_1+"  "+ch7_2);
	System.out.println("   "+ch7_1+ch7_3+ch7_4+" "+ch7_5+ch7_2);
	System.out.println("  "+ch7_1+"      "+ch7_2);
	System.out.println(" "+ch7_1+ch7_3+ch7_3+ch7_3+ch7_3+ch7_1+ch7_2+"__"+ch7_2);

//=================================================================
	System.out.println("\n8.Вывод количества сотен, десятков и единиц числа");
//=================================================================
	int i8 = 123;
	int hundreds = i8 / 100;
	int tens = (i8 - hundreds * 100) / 10;
	int ones = (i8 - hundreds * 100 - tens * 10) % 10;
	System.out.println("Число "+i8+" содержит:");
	System.out.println(hundreds+" сотен");
	System.out.println(tens+" десятков");
	System.out.println(ones+" единиц");
	System.out.println("Сумма его цифр = " + (hundreds + tens + ones) );
	System.out.println("Произведение = " + (hundreds * tens * ones) );

//=================================================================
	System.out.println("\n9.Вывод времени");
//=================================================================
	int seconds = 86399;
	int hour = seconds / 60 / 60;
	int min = (seconds - hour * 60 * 60)/60;
	int sec = (seconds - hour * 60 * 60 - min * 60) % 60;
	System.out.println(hour+":"+min+":"+sec);
	}
} 