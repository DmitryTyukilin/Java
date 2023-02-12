package com.tyukilin.java.hometask.week2.cycles;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 * [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] ->  [0, 0]
 * [1, 9, 3]
 */
public class Task5_3 {
    public static void main(String[] args) {
        int[] array = {4, 0, -2, 1, 9, 0, 18, 3, -3, 9};
        System.out.println();
        array2D(minusArray(array), plusArray(array), zeroArray(array));
    }

    public static int[] minusArray(int[] array) {
        int[] arrayMinus = new int[calculateArraySizeMinus(array)];
        int currentCell = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                arrayMinus[currentCell++] = array[j];
            }
        }
        return arrayMinus;
    }

    public static int[] plusArray(int[] array) {
        int[] arrayPlus = new int[calculateArraySizePlus(array)];
        int currentCell = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                arrayPlus[currentCell++] = array[j];
            }
        }
        return arrayPlus;
    }

    public static int[] zeroArray(int[] array) {
        int[] arrayZero = new int[calculateArrayEqually(array)];
        int currentCell = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                arrayZero[currentCell++] = array[j];
            }
        }
        return arrayZero;
    }

    public static void array2D(int[] minusArray, int[] plusArray, int[] zeroArray) {
        int[][] array2D = {minusArray, plusArray, zeroArray};
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int calculateArraySizeMinus(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                num++;
            } else num = num + 0;
        }
        return num;
    }

    public static int calculateArraySizePlus(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                num++;
            } else num = num + 0;
        }
        return num;
    }

    public static int calculateArrayEqually(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                num++;
            } else num = num + 0;
        }
        return num;
    }
}


