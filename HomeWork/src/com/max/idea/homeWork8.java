package com.max.idea;

import java.util.Scanner;

public class homeWork8 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит любое целое положительное число n.
//        А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Ответ: " + sum);
    }
}
