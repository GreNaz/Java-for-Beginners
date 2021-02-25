package com.max.idea;

import java.util.Scanner;

public class homeWork10 {
    public static void main(String[] args) {
//        Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
//        а после этого произведите вывод первой строки матрицы на экран,
//        где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество строк:");
        int numberOfLines = scanner.nextInt();
        System.out.println("Количество столбцов:");
        int numberOfColumns = scanner.nextInt();
        int[][] array = new int[numberOfLines][numberOfColumns];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < numberOfLines; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Первая строка матрицы после преобразования:");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] *= 3;
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
