package com.tyukilin.java.hometask.week2.cycles;
/*Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число,
а возвращать количество четных цифр (вторая функция - нечетных).

Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).*/

public class Task4_1 {
    public static void main(String[] args) {
        int number = 228910;
        int evenNumber = getEvenNumber(number);
        int oddNumber = getOddNumber(number);
        System.out.println("Количество чётных чисел " + evenNumber);
        System.out.println("Количество не чётных чисел " + oddNumber);
    }

    public static int getOddNumber (int number1) {
        int result = 0;
        for (int currentValue = number1; currentValue > 0; currentValue = currentValue / 10) {
            int number = currentValue % 10;
            if (number % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static int getEvenNumber(int number2) {
        int result = 0;
        for (int currentValue = number2; currentValue > 0; currentValue = currentValue / 10) {
            int number = currentValue % 10;
            if (number % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
