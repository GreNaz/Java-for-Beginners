package com.max.idea;

import java.util.Locale;
import java.util.Scanner;

public class homeWork11 {
    public static void main(String[] args) {
        /*Напишите программу:
        Ввести первое  число с клавиатуры и записать его в строковую переменную.
        Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        Сравнить 2 числа и вывести большее на экран.
        Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.*/
        int fN;
        double min;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String firstNumber = scanner.next();
        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        fN = Integer.parseInt(firstNumber);
        System.out.println(Math.max(fN,
                secondNumber));


        min = Math.min(fN,
                secondNumber);
        System.out.println(min);
    }

}
