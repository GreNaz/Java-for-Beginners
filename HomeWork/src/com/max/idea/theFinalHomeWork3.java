package com.max.idea;

import java.util.Scanner;

public class theFinalHomeWork3 {
    public static void main(String[] args) {
        /*Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
        Среди данных строк найти строку с максимальным количеством различных символов.
        Если таких строк будет много, то вывести первую.
        Пример для теста работы программы:
        Количество строк: 3
        Строка 1: привет
        Строка 2: анализ
        Строка 3: 111111111111
        Ответ: привет*/


        int stringNum;
        int index = 0;
        int maxNumberCharInString = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        stringNum = scanner.nextInt();
        String[] stringsArray = new String[stringNum];
        int[] numberCharInString = new int[stringNum];
        System.out.println("Введите строки:");
        for (int i = 0; i < stringsArray.length; i++) {
            stringsArray[i] = scanner.next();
            numberCharInString[i] = (int) stringsArray[i].chars().distinct().count();
            if (numberCharInString[i] > maxNumberCharInString){
                maxNumberCharInString = numberCharInString[i];
                index = i;
            }
        }
        System.out.println("Ответ:" + stringsArray[index]);
    }
}
