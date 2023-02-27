package com.tyukilin.java.lessons.oop.learning.Computer;

public class Mobile extends Computer {
    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void print() {
        super.print();

    }

    @Override
    public void load() {
        System.out.println("Я включился");


    }
}
