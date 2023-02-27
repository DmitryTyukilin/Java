package com.tyukilin.java.lessons.oop.learning.lesson13;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * * возвращающую true, если строка начинается и заканчивается этим словом.
 * * <p>
 */
public class Les13_task2 {
    public static void main(String[] args) {

        String name = "привет ты сегодня пойдешь гулять привет";
        String word = "привет";
        System.out.println(isStarAndEnd(name, word));
    }

    private static boolean isStarAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}

    

