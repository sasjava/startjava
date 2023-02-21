package com.startjava.lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        reversArr();
        multiplyArrItems();
        nullingArrItems();
        displayReversStairs();
        generateUniqueNumbers();
        shiftArr();
    }

    private static void reversArr() {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7}; //{6, 4, 7, 1, 3, 2, 5};
        printIntArr(intArr);
        int len = intArr.length;
        for (int i = 0; i < len; i++) {
            len--;
            int tmp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = tmp;
        }
        printIntArr(intArr);
    }

    private static void multiplyArrItems() {
        System.out.println("\n2. Вывод произведения элементов массива");
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        int maxIndex = intArr.length - 1;
        int result = 1;

        for (int i = 0; i < intArr.length; i++) {
            if (i == 0 || i == maxIndex) {
                System.out.print(((i == maxIndex) ? " = " + result + "\n" : "") + "[" + i + "] = " + intArr[i] + "\n");
            } else {
                result *= intArr[i];
                System.out.print(((result > 1) ? "*" : "" ) + intArr[i]);
            }
        }
    }

    private static void nullingArrItems() {
        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        int len = floatArr.length;
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            floatArr[i] = random.nextFloat() ;
        }
        System.out.println("Исходный массив:");
        printFloatArr(floatArr);

        float middleCellValue = 0;
        int middleIndex = len / 2;
        middleCellValue = floatArr[middleIndex];
        System.out.printf("Значение среднего элемента: [%s] %6.3f\n", middleIndex, middleCellValue);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (floatArr[i] > middleCellValue) {
                floatArr[i] = 0;
                count++;
            }
        }
        System.out.println("Новый массив:");
        printFloatArr(floatArr);
        System.out.println("Количество обнуленных ячеек " + count);
    }

    private static void displayReversStairs() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        int len = 'Z' - 'A' + 1;
        char[] alphabetArr = new char[len];
        alphabetArr[0] = 'A';
        for (int i = 1; i < len; i++) {
            alphabetArr[i] = (char) ('A' + i);
        }
        printCharArrStairs(alphabetArr);
    }

    private static void generateUniqueNumbers() {
        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        Random random = new Random();
        for (int i = 0; i < uniqueNumbers.length; i++) {
            int number = 0;
            while (number == 0 || !isUnique(uniqueNumbers, number)) {
                number = random.nextInt(40) + 60;
            }
            uniqueNumbers[i] = number;
        }
        System.out.println("Массив уникальных чисел");
        printIntArr(uniqueNumbers);
        sortIntArr(uniqueNumbers);
        System.out.println("Отсортированный массив");
        printIntArr(uniqueNumbers, 10);
    }

    private static void shiftArr() {
        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int lenResult = 0;
        for (String itemArr: srcArr ) {
            if (!itemArr.isBlank()) {
                lenResult++;
            }
        }
        String[] resArr = new String[lenResult];
        int srcPosRange = 0;
        int resPosRange = 0;
        int lenghtRange = 0;
        for (int i = 0; i < srcArr.length; i++) {
            if (srcArr[i].isBlank()) {
                if (lenghtRange != 0) {
                    srcPosRange = srcPosRange - lenghtRange + 1;
                    resPosRange = resPosRange - lenghtRange;
                    System.arraycopy(srcArr, srcPosRange, resArr, resPosRange, lenghtRange);
                    resPosRange += lenghtRange;
                    lenghtRange = 0;
                }
            } else {
                srcPosRange = i;
                lenghtRange++;
                resPosRange++;
            }
        }
        System.out.println(Arrays.toString(srcArr) + "\n" + Arrays.toString(resArr));
    }

    private static boolean isUnique(int[] arr, int val) {
        for (int itemArr : arr) {
            if (itemArr == val) {
                return false;
            }
        }
        return true;
    }

    private static void printCharArrRevers(char[] arr, int len) {
        int minIndex = arr.length - len;
        if (minIndex < 0) {
            minIndex = 0;
        }
        for (int i = arr.length - 1; i >= minIndex; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static void printCharArrStairs(char[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            printCharArrRevers(arr, i);
        }
    }

    private static void sortIntArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minVal = arr[i];
            int minValIndex = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minValIndex = j;
                    minVal = arr[j];
                }
            }
            if (i != minValIndex & minValIndex != 0) {
                minVal = arr[minValIndex];
                arr[minValIndex] = arr[i];
                arr[i] = minVal;
            }
        }
    }

    private static void printIntArr(int[] arr) {
        for (int intArrItem : arr) {
            System.out.print(intArrItem + " ");
        }
        System.out.println();
    }

    private static void printIntArr(int[] arr, int len) {
        for (int i = 0; i < arr.length; i++) {
            if ((i / len) != ((i - 1) / len)) {
                System.out.println();
            }
            System.out.printf("%3s", arr[i]);
        }
        System.out.println("");
    }

    private static void printFloatArr(float[] arr) {
        int lineLength = 8;
        for (int i = 0; i < arr.length; i++) {
            if ((i / lineLength) != ((i - 1) / lineLength)) {
                System.out.println();
            }
            System.out.printf("%8.3f", arr[i]);
        }
        System.out.println();
    }
}
