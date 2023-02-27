package com.tyukilin.java.lessons.oop.learning.Computer;

public class OopLessonRunner {
    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ram(512), new Ssd(700), 2);
        Computer mobile = new Mobile(new Ram(128), new Ssd(512));
        Laptop laptop1 = new Laptop(new Ram (5000), new Ssd (10000), 5);

        loadComputers(laptop, mobile);
        printIformation(new Computer[] {laptop, mobile});

    }
    public static void printIformation(Computer[] computers) {
        for (Computer computer : computers) {
            computer.print();
            if(computer instanceof Laptop) {
                Laptop laptop = (Laptop) computer;
                laptop.open();
            }
            
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();


        }
    }
}

