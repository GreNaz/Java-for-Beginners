package com.max.idea;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        //Создание переменных:
        //Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей произвольное дробное значение.
        //Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте  ей наибольшее возможное значение.
        Random random = new Random();
        double doubleNum = random.nextDouble();
        System.out.println(doubleNum);
        byte byteNum = Byte.MAX_VALUE;
        System.out.println(byteNum);
    }
}
