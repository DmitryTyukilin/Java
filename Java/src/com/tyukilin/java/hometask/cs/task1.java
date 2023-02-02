package com.tyukilin.java.hometask.cs;

/* В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
Протестировать функцию в main.
*/
public class task1 {
    public static void main(String[] args) {
        int minutes = 45;
        if (0 > minutes || minutes >= 59) { // time check
            System.out.println("Time error");
        } else getQuarterHour(minutes);
    }
    public static void getQuarterHour(int minutes) {
        if (minutes <= 15) {
            System.out.println("It one quarter hour");
        } else if (minutes <= 30) {
            System.out.println("It two quarter hour");
        } else if (minutes <= 45) {
            System.out.println("It three quarter hour");
        } else if (minutes <= 59) {
            System.out.println("It four quarter hour");
        }
    }
}