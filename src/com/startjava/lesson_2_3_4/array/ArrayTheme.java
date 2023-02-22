package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        reversArr();
        multiplyArrItems();
        nullingArrItems();
        displayAlphabetReversStairs();
        generateUniqueNumbers();
        copyNotBlankArrItems();
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
        int result = 1;

        for (int i = 1; i < intArr.length - 1; i++) {
            result *= intArr[i];
            System.out.print(((result > 1) ? " * " : "" ) + intArr[i]);
        }
        System.out.println(" = " + result + "\n[0] = " + intArr[0] + "\n" + "[9] = " + intArr[9]);
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

        int middleIndex = len / 2;
        float middleCellValue = floatArr[middleIndex];
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

    private static void displayAlphabetReversStairs() {
        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        int len = 'Z' - 'A' + 1;
        char[] alphabet = new char[len];
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        printAlphabetArrStairs(alphabet);
    }

    private static void generateUniqueNumbers() {
        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        Random random = new Random();
        for (int i = 0; i < uniqueNumbers.length; i++) {
            int number;
            do {
                number = random.nextInt(40) + 60;
            } while (number == 0 || !isUnique(uniqueNumbers, number));
            uniqueNumbers[i] = number;
        }
        sortIntArr(uniqueNumbers);
        System.out.println("Отсортированный массив");
        printIntArr(uniqueNumbers, 10);
    }

    private static void copyNotBlankArrItems() {
        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotBlank = 0;
        for (String item: srcStrings) {
            if (!item.isBlank()) {
                countNotBlank++;
            }
        }
        String[] destStrings = new String[countNotBlank];
        int srcPosRange = 0;
        int resPosRange = 0;
        int lenghtRange = 0;
        for (int i = 0; i < srcStrings.length; i++) {
            if (srcStrings[i].isBlank()) {
                if (lenghtRange != 0) {
                    srcPosRange -= lenghtRange - 1;
                    resPosRange -= lenghtRange;
                    System.arraycopy(srcStrings, srcPosRange, destStrings, resPosRange, lenghtRange);
                    resPosRange += lenghtRange;
                    lenghtRange = 0;
                }
            } else {
                srcPosRange = i;
                lenghtRange++;
                resPosRange++;
            }
        }
        System.out.println(Arrays.toString(srcStrings) + "\n" + Arrays.toString(destStrings));
    }

    private static boolean isUnique(int[] arr, int val) {
        for (int itemArr : arr) {
            if (itemArr == val) {
                return false;
            }
        }
        return true;
    }

    private static void printAlphabetArrRevers(char[] arr, int len) {
        int minIndex = arr.length - len;
        if (minIndex < 0) {
            minIndex = 0;
        }
        for (int i = arr.length - 1; i >= minIndex; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    private static void printAlphabetArrStairs(char[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            printAlphabetArrRevers(arr, i);
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
