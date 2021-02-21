package com.max.idea;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
//  1. Пользователю предлагается на выбор ввести массу или расстояние.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int measure = scanner.nextInt();

//  2. Пользователю предлагается выбрать единицу измерения.
        if (measure == 1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - стоун, 3 - фунт, 4 - унция");
        }
        else if (measure == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        }
        else {
            System.out.println("Ошибака! Такого варианта нет, попробуйте еще раз");
            return;
        }
        int unit = scanner.nextInt();

//  3. Пользователю предлагается ввести количество выбранных единиц:
        System.out.println("Введите число");
        double value = scanner.nextDouble();

        if (measure == 1) {
            switch (unit) {
                case 1 -> System.out.printf("Результат: \n" + "Граммы: %.3f \nСтоуны: %.3f \nФунты: %.3f \nУнции: %.3f",
                        value, value * 0.000157473, value * 0.00220462, value * 0.035274);
                case 2 -> System.out.printf("Результат: \n" + "Граммы: %.3f \nСтоуны: %.3f \nФунты: %.3f \nУнции: %.3f",
                        value * 6350.29, value, value * 14, value * 224);
                case 3 -> System.out.printf("Результат: \n" + "Граммы: %.3f \nСтоуны: %.3f \nФунты: %.3f \nУнции: %.3f",
                        value * 453.592, value * 0.0714286, value, value * 16);
                case 4 -> System.out.printf("Результат: \n" + "Граммы: %.3f \nСтоуны: %.3f \nФунты: %.3f \nУнции: %.3f",
                        value * 28.3495, value * 0.00446429, value * 0.0625, value);
                default -> System.out.println("Такого варианта нет");
            }
        } else {
            switch (unit){
                case 1 -> System.out.printf("Результат: \n" + "Метры: %.3f \nМили: %.3f \nЯрды: %.3f \nФут: %.3f",
                        value, value * 0.000621371, value * 1.09361, value * 3.28084);
                case 2 -> System.out.printf("Результат: \n" + "Метры: %.3f \nМили: %.3f \nЯрды: %.3f \nФут: %.3f",
                        value * 1609.34, value, value * 1760, value * 5280);
                case 3 -> System.out.printf("Результат: \n" + "Метры: %.3f \nМили: %.3f \nЯрды: %.3f \nФут: %.3f",
                        value * 0.9144, value * 0.000568182, value, value * 3   );
                case 4 -> System.out.printf("Результат: \n" + "Метры: %.3f \nМили: %.3f \nЯрды: %.3f \nФут: %.3f",
                        value * 0.3048, value * 0.000189394, value * 0.333333, value);
                default -> System.out.println("Такого варианта нет");
            }
        }
    }
}
