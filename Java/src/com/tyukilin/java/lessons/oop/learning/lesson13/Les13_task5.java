package com.tyukilin.java.lessons.oop.learning.lesson13;

import java.util.Arrays;

/**
 * 5. Написать функцию, разбивающую строку на равные части по n символов и
 * * сохраняющую отдельные части в массив. Вывести этот массив.
 */
public class Les13_task5 {
    public static void main(String[] args) {
        String value = "12345";
        int n = 2;
        String[] result = split(value, n);
        System.out.println(Arrays.toString(result));// Возвращает строковое предстваление массива

    }

    public static String[] split(String value, int n) {
        int arraySize = (int) Math.ceil(value.length() / (double) n);
        String[] result = new String[arraySize];
        int counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = value.length() > i + n ? i + n : value.length();
            String substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;
        }
        return result;
    }
}
/**
 * i += n задаем такой счетчик для того чтобы разбивать входной массив на n элементов
 * String[] result = new String[arraySize] создаем массив с таким размером, чтобы в него уместились новые сгрупированные
 * значения n.
 * int arraySize = (int) Math.ceil(value.length() / (double) n); задаем длину массива result, Math.ceil окргуляем в +
 * приводит к (int) так размер [] задется в int
 *String substring = value.substring(i, endIndex); передаем нач индекс кон индекс получаем значение между индексами
 * value.length() > i + n ? i + n : value.length(); условие чтобы не выйти за длину массива при назначение крайнего индекса
 */
