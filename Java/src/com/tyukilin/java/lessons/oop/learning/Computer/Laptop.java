package com.tyukilin.java.lessons.oop.learning.Computer;


import java.sql.SQLOutput;

public final class Laptop extends Computer {
    private int weight;

    public Laptop(Ram ram, Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }

    public void open() {
        System.out.println("Я открыл крышку");
    }

    @Override
    public void print() { // переопределим метод print добавиь в него свойство от Laptop
        super.print(); // обращаемся к print родительского класса
        System.out.println("Мой вес: " + weight);

    }

    @Override
    public void load() {
        open();
        System.out.println("Я загрузился");



    }
}
