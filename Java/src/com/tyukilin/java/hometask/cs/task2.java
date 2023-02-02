package com.tyukilin.java.hometask.cs;

/*Даны 3 переменные:
- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.
Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
* */
public class task2 {
    public static void main(String[] args) {
        double operand1 = 135.0;
        double operand2 = 3;
        char operation = '/';
        if (operand2 != 0) {
            System.out.println(calculationValue(operand1, operand2, operation));
        }
        else {
            System.out.println("incorrect value");
        }
    }
    public static double calculationValue(double operand1, double operand2, char operation) {
        double result = 0;
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else if (operation == '%') {
            result = operand1 % operand2;
        }
        return result;
    }
}

