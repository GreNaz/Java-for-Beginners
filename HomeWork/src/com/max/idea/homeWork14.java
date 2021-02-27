package com.max.idea;

import java.util.Arrays;
import java.util.Random;

public class homeWork14 {
    public static void main(String[] args) {
       /* Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
        Далее:
        Выведите максимальный и минимальный элемент массива.
        Из максимального и минимального значения выведите наибольшее по модулю.*/
        int max, min;
        Random random = new Random();
        int[] newArray = new int[15];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = random.nextInt(40) - 20;
        }
        max = Arrays.stream(newArray).max().getAsInt();
        min = Arrays.stream(newArray).min().getAsInt();
        System.out.println(Math.max(Math.abs(max),Math.abs(min)));
    }
}
