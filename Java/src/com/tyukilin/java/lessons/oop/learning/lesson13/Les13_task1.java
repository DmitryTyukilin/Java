package com.tyukilin.java.lessons.oop.learning.lesson13;

/**
 * 1. Заменить все грустные смайлы :( в строке на весёлые :)
 * <p>

 */
public class Les13_task1 {
    public static void main(String[] args) {
        String value = "adawda :( addw :(adwad :) adawd :)";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {

        return value.replace(":(", ":)");// заменаяем
    }
}






