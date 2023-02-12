package com.tyukilin.java.hometask.week2.cycles;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа
 * (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного
 * массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task5_2 {
    public static void main(String[] args) {
        char[] arrayOne = {'a', '6', 'y', 'P', 'T', 'q', '9', 'ъ' };
        arrayChar(arrayOne);
        System.out.println();
        printMax(arrayChar(arrayOne));
    }

    public static int[] arrayChar(char[] arrayOne) {
        int[] result = new int[arrayOne.length];
        int num = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            int symbol = arrayOne[i];
            result[num] = symbol;
            num++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }

    public static void printMax(int[] arrayChar) {
        double mean = 0;
        int[] num = arrayChar;
        for (int currentNumber = 0; currentNumber < num.length - 1; currentNumber++) {
            mean = mean + num[currentNumber];
        }
        mean = mean / num.length;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > mean) {
                System.out.print(num[i] + " "); //
            }
        }
    }
}



