package com.max.idea;

import java.util.Scanner;

public class homeWork13 {
    public static void main(String[] args) {
        /*Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
        Например: “I love java 8 Я люблю java 14 core1”.
        Выполните следующие действия:
        Выведите слова, состоящие только из латиницы.
        Выведите количество этих слов.*/
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        String[] splitArray = inputString.split(" ");
        for (String str : splitArray) {
            if (str.matches("[a-zA-Z]+")){
                System.out.println(str);
                counter ++;
            }
        }
        System.out.println(counter);
    }
}
