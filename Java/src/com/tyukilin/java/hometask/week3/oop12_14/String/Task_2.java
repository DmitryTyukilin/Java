package com.tyukilin.java.hometask.week3.oop12_14.String;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task_2 {
    public static void main(String[] args) {
        String value = "Привет 8956312313, как 1 278 твои дела? Может4, сделать 3 дело?";
        char[] stChar = value.toCharArray();
        char[] chars = new char[value.length()];
        int current = 0;
        for (int i = 0; i < stChar.length - 1; i++) {
            int a = stChar[i];
            if (48 <= a && a <= 57) {
                chars[current++] = stChar[i];
            }
        }
        for (char a : chars) {
            System.out.print(a  + " ");
        }
    }
}

