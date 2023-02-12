package com.tyukilin.java.hometask.week2.cycles;
/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task5_1 {
    public static void main(String[] args) {
        int[] array = {2, 3, -7, 8, 0, 9, -12};
        printArrayForeach(deletValue(array));
    }

    public static int[] deletValue(int[] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                num++;
            }
        }
        int[] posNumber = new int[num];
        int currentCell = 0; // текущая ячейка
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                posNumber[currentCell] = array[i];
                currentCell++;

            }
        }
        int num1 = posNumber.length;
        currentCell = 0;
        for (int j = 0; j < posNumber.length; j++) {
            posNumber[currentCell] = posNumber[j] * num1;
            currentCell++;
        }
        return posNumber;
    }

    public static void printArrayForeach(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

