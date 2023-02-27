package com.tyukilin.java.lessons.oop.learning.lesson13;

/**
 * 4. Подсчитать количество всех точек, запятых и восклицательных знаков в
 * * строке.
 */
public class Les13_task4 {
    public static void main(String[] args) {
        String value = "asdfsd.,asdasd.!adsdsad!sadas";
        System.out.println(countSumbls(value));
    }

    public static int countSumbls(String value) {
        String result = value.replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}

