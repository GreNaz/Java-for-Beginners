package com.max.idea;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
//    Напишите простой калькулятор:
//    Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNum = scanner.nextDouble();
        System.out.println("Введите второе число");
        double secondNum = scanner.nextDouble();
        System.out.println("Введите знак операции (+, -, * или /)");
        String symbol = scanner.next();
//    В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        switch (symbol){
            case "+":
                System.out.println(firstNum + secondNum);
                break;
            case "-":
                System.out.println(firstNum - secondNum);
                break;
            case "*":
                System.out.println(firstNum * secondNum);
                break;
            case "/":
                if (secondNum == 0) {
                    System.out.println("Можно конечно, но там надо в высший матан лезть, давай без этого");
                }
                else
                    System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("Не понял чего хочешь");
                break;
        }
    }
}

