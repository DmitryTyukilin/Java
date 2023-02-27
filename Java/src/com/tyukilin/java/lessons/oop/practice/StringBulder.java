package com.tyukilin.java.lessons.oop.practice;

public class StringBulder {
    public static void main(String[] args) {
        long staratTime = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time:" + (endTime - staratTime));
    }

}

