package com.max.idea;

import java.util.Scanner;

public class homeWork12 {
    public static void main(String[] args) {
        /*Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
        Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        if (inputString.contains("Java") && inputString.startsWith("I like") && inputString.endsWith("!!!")){
            System.out.println(inputString.toUpperCase());
        }
        System.out.println(inputString.replaceAll("a", "o").substring(7, 11));
    }
}
