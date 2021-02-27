package com.max.idea;

import java.util.Scanner;

public class theFinalHomeWork1 {
    public static void main(String[] args) {
        /*Напишите программу конвертер валют.
        Программа должна переводить рубли в доллары по текущему курсу.
        Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть
        округлено до двух знаков после запятой. Пример для теста работы программы:
        Курс доллара: 67,55
        Количество рублей: 1000
        Итого: 14,80 долларов*/

        float numberOfRubles;
        float currentCourse;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс:");
        currentCourse = scanner.nextFloat();
        System.out.println("введите количество рублей:");
        numberOfRubles = scanner.nextFloat();
        System.out.printf("Итого: %.2f долларов", numberOfRubles/currentCourse);
    }
}
