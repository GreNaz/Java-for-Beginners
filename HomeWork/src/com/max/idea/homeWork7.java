package com.max.idea;
import java.util.Scanner;

public class homeWork7 {
    public static void main(String[] args) {
//        Напишите программу:
        Scanner scanner = new Scanner(System.in);
        int x = 15;
        int y = 25;
        int z = 3;
        // 1. Пользователь вводит размер массива и данные с клавиатуры в массив
        System.out.print("Задайте размер массива:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Введите элементы массива по 1 числу:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // 2. Сравнить элементы массива с заранее заданными константами x, y, z.
        // 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        for (int number : array) {
            if (number == x || number == y || number == z) {
                System.out.println(number + " - Данное значение имеется в константах");
            } else {
                System.out.println(number);
            }
        }
    }
}
