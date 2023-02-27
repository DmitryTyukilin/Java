package com.tyukilin.java.lessons.oop.learning.Computer;


import java.util.Random;

public interface Printable {

        String SOME_VALUE = "Example";
        Random RANDOM = new Random();

        default void printWithRandom() {
            System.out.println(generateRandom()); // можно теперь установить в любой дефолтный метод
            print(); // этого интерфеса, и получать рандомное число

        }
        void print();
        private int generateRandom(){ // метод генерирующий рандом значение
            return RANDOM.nextInt();
        }
    }

