package com.tyukilin.java.hometask.cs;

/* Даны два прямоугольных треугольника.
Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше,
меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.
*
*
* */
public class task3 {
    public static void main(String[] args) {
        int a1 = 6;
        int b1 = 4;
        int a2 = 6;
        int b2 = 4;
        double Area1 = calculationArea(a1, b1);
        double Area2 = calculationArea(a2, b2);
        if (a1 > 0 && b1 > 0 && a2 > 0 && b2 > 0) { // возможно сделать проверку лаконичнее?
            current(Area1, Area2);
        } else {
            System.out.println("error");
        }
    }
    public static double calculationArea(int a, int b) {
        return  (a * b) / 2;
    }
    public static void current(double Area1, double Area2) {
        if (Area1 < Area2) {
            System.out.println("Area triangle1" + " less " + "Area triangle2");
        } else if (Area1 > Area2) {
            System.out.println("Area triangle1" + " more " + "Area triangle2");
        } else if (Area1 == Area2) {
            System.out.println("Area triangle1" + " equal " + "Area triangle2");
        }
    }
}
