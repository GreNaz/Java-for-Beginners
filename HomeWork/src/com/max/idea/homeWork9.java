package com.max.idea;

import java.util.Scanner;

public class homeWork9 {
    public static void main(String[] args) {
//        Напишите программу:
//        Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        double[] array = new double[arraySize];
        System.out.println("Введите элементы массива по одному:");
        for (int i = 0; i < arraySize; i++){
            array[i] = scanner.nextDouble();
        }
//        Посчитайте среднее арифметическое элементов массива.
        double sum = 0;
        for (int i = 0; i < arraySize; i++){
            sum += array[i];
        }
        double average = sum / arraySize;
        System.out.printf("Среднее арифметическое = %.2f\n", average);
//      После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (double number : array) {
            System.out.printf( "%.2f ", number * average);
        }
    }
}
