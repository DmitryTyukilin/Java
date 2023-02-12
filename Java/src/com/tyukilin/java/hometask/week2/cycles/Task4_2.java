package com.tyukilin.java.hometask.week2.cycles;
/*Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)*/

public class Task4_2 {
    public static void main(String[] args) {

        int result = reversValue(563320);
        System.out.println(result);
    }

    public static int reversValue(int value) {
        int result = 0;
        int currentValue = value;
        while (currentValue != 0) {
            result = result + currentValue % 10;
            currentValue /= 10;
            if (currentValue != 0) {
                result = result * 10;
            }
        }
        return result;
    }
}