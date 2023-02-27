package com.tyukilin.java.lessons.oop.learning.Computer;

public class OopLessonRunner2 {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(512), new Ssd(700), 2);
        Computer mobile = new Mobile(new Ram(128), new Ssd(512));
        printWithRandom(laptop, mobile);
    }

    //    public static void print(Printable... objects) {
//        for (Printable object : objects) {
//            object.print();
//        }
    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
