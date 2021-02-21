package com.max.idea;

public class HomeWork3 {
    public static void main(String[] args) {
        //Выполните следующие действия с массивом:
        //Задайте массив из 5 любых целых чисел.
        int[] nums = new int[] {1, 2, 3, 4, 5};
        //Поменяйте местами первый и последний элемент в массиве.
        int a = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = a;

        //проверка вывода
        for (int i = 0; i < nums.length; i++){  // идём по строкам
             System.out.print(nums[i] + " ");  // вывод элемента
        }
        System.out.println(); // перенос строки
        //Вывести в консоль результат суммы первого и среднего элемента.
        System.out.println(nums[0] + nums[nums.length / 2]  );

    }
}
