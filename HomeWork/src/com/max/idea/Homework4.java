package com.max.idea;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//  Написать программу, которая будет выполнять следующие действия:
//  Ввести три числа с клавиатуры x, y, z
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
//  Найти и вывести в консоль среднее арифметическое этих чисел.
        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое = " + average);
//  Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double floor = Math.floor(average / 2);
        System.out.println("Поделенное на 2 и округленное в меньшую сторону =" + floor);
//  Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (floor > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}