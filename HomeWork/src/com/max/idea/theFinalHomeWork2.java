package com.max.idea;

import java.util.Scanner;

public class theFinalHomeWork2 {
    public static void main(String[] args) {
        /*Напишите программу, которая позволит решить простое уравнение относительно x.
        Программа принимает на вход строку длиной 5 символов.
        Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
        Нужно найти неизвестное.
        Пример для теста работы программы:
        Ввод: x+5=7
        Вывод: 2
        Ввод: 3-x=9
        Вывод: -6
        Ввод: 3-3=x
        Вывод: 0*/

        int variableIndex;
        String inputString;
        int const1;
        int const2;
        System.out.println("Введите уравнение:");
        Scanner scanner= new Scanner(System.in);
        inputString =scanner.nextLine();
        variableIndex = inputString.indexOf("x");

        if (inputString.contains("+")){
            if (variableIndex == 0){
                const1 = Character.getNumericValue(inputString.charAt(2));
                const2 = Character.getNumericValue(inputString.charAt(4));
                System.out.println(const2 - const1);
            }
            else if (variableIndex == 2){
                const1 = Character.getNumericValue(inputString.charAt(0));
                const2 = Character.getNumericValue(inputString.charAt(4));
                System.out.println(const2 - const1);
            }
            else {
                const1 = Character.getNumericValue(inputString.charAt(0));
                const2 = Character.getNumericValue(inputString.charAt(2));
                System.out.println(const2 + const1);
            }
        }
        else if (inputString.contains("-")){
            if (variableIndex == 0){
                const1 = Character.getNumericValue(inputString.charAt(2));
                const2 = Character.getNumericValue(inputString.charAt(4));
                System.out.println(const2 + const1);
            }
            else if (variableIndex == 2){
                const1 = Character.getNumericValue(inputString.charAt(0));
                const2 = Character.getNumericValue(inputString.charAt(4));
                System.out.println(const2 + const1);
            }
            else {
                const1 = Character.getNumericValue(inputString.charAt(0));
                const2 = Character.getNumericValue(inputString.charAt(2));
                System.out.println(const1 - const2);
            }
        }
    }
}
