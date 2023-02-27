package com.tyukilin.java.lessons.oop.learning.lesson13;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 *  * отчество и возвращающую инициалы
 *  * в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 *  * регистре, а результирующая строка должна быть в верхнем.
 */
public class Les13_task3 {
    public static void main(String[] args) {
String result = format("Ivan","Petrov", "Sidorovich" );
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
         char firstNameChar = Character.toUpperCase(firstName.charAt(0)); // берем первую букву из наших входых слов
         char lastNameChar = Character.toUpperCase(lastName.charAt(0));
         char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
//         return firstNameChar + "." + lastNameChar + "." + patronymicNameChar; // 1 способ
        return String.format("%s.%s.%s", firstNameChar,lastNameChar,patronymicNameChar); // 2  способ
                //"%" зерезервированное слово
    }
    
}
