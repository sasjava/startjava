package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTheme {
    public static void main(String[] args) {
        reversArr();
        multiplyArr();
        deleteFromArr();
        displayStairs();
        generateUniqueNumbers();
        shiftArr();
    }

    private static void reversArr() {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7}; //{6, 4, 7, 1, 3, 2, 5};
        int maxIndex = intArr.length - 1;
        int halfLength = intArr.length / 2;
        printIntArr(intArr);
        for (int i = 0; i < halfLength; i++) {
            intArr[i] += intArr[maxIndex - i];
            intArr[maxIndex - i] = intArr[i] - intArr[maxIndex - i];
            intArr[i] -= intArr[maxIndex - i];
        }
        printIntArr(intArr);
        System.out.println();
    }

    private static void multiplyArr() {
        System.out.println("2. Вывод произведения элементов массива");
        int[] intArr = new int[10];
        int[] intArr2 = {0, 9};
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        String strResult = "";
        String strResult2 = "";
        String strTmp;
        int intResult = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (existValInArr(intArr2, intArr[i])) {
                strTmp = "[" + i + "] = " + intArr[i];
                strResult2 = strResult2.isBlank() ? strTmp : strResult2 + ", " + strTmp;
            } else {
                intResult = intResult == 0 ? intArr[i] : intResult * intArr[i];
                strResult = strResult.isBlank() ? intArr[i] + "" : strResult + "*" + intArr[i];
            }
        }
        strResult = strResult + " = " + intResult;
        System.out.println(strResult);
        System.out.println(strResult2);
        System.out.println();
    }

    private static void deleteFromArr() {
        System.out.println("3. Удаление элементов массива");
        float[] floatArr = new float[15];
        float averVal = 0;
        int averValIndex = 0;
        float difference = 1;
        int count = 0;
        Random random = new Random();

        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = random.nextFloat() ;
            averVal += floatArr[i];
        }
        averVal /= floatArr.length;
        System.out.println("Исходный массив:");
        printFloatArr(floatArr);

        for (int i = 0; i < floatArr.length; i++) {
            if (difference > Math.abs(floatArr[i] - averVal)) {
                difference = Math.abs(floatArr[i] - averVal);
                averValIndex = i;
            }
        }
        System.out.printf("Среднее значение: [%s] %6.3f\n", averValIndex, floatArr[averValIndex]);

        for (int i = 0; i < floatArr.length; i++) {
            if (floatArr[i] > averVal) {
                floatArr[i] = 0;
                count++;
            }
        }
        System.out.println("Новый массив:");
        printFloatArr(floatArr);
        System.out.println("Количество обнуленных ячеек " + count);
        System.out.println();
    }

    private static void displayStairs() {
        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        int len = 'Z' - 'A' + 1;
        char[] charArr = new char[len];
        charArr[0] = 'A';
        for (int i = 1; i < len; i++) {
            charArr[i] = charArr[i - 1];
            charArr[i]++;
        }
        printCharArrStairs(charArr);
        System.out.println();
    }
    private static void generateUniqueNumbers() {
        System.out.println("5. Генерация уникальных чисел");
        int[] intArr = new int[30];
        Random random = new Random();
        for (int i = 0; i < intArr.length; i++) {
            int intVal = 0;
            while (intVal == 0 || existValInArr(intArr, intVal)) {
                intVal = random.nextInt(40) + 60;
            }
            intArr[i] = intVal;
        }
        System.out.println("Массив уникальных чисел");
        printIntArr(intArr);
        sortIntArr(intArr);
        System.out.println("Отсортированный массив");
        printIntArr(intArr, 10);
        System.out.println();
    }

    private static void shiftArr() {
        System.out.println("6. Сдвиг элементов массива");
        String[] srcArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int[][] ranges = new int[2][2];
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
        //System.arraycopy (srcArr, 1, resArr, 0, lenResult);

        System.out.println(Arrays.toString(srcArr));
        System.out.println(Arrays.toString(resArr));
    }
    private static boolean existValInArr(int[] arr, int val) {
        for (int itemArr : arr) {
            if (itemArr == val) {
                return true;
            }
        }
        return false;
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
        System.out.println();
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
    private static void printStrArr(String[] arr) {
        for (String itemArr : arr) {
            System.out.printf("%5s", itemArr);
        }
        System.out.println();
    }
}
