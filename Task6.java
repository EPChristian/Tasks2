package com.dmdev.l2;

/**
 * Задача 6: Массивы и многомерность
 * Создайте двумерный массив (3x3), заполните его случайными числами от 0 до 9 и выведите на экран. Затем найдите сумму
 * элементов на главной диагонали.
 */
public class Task6 {
    public static void main(String[] args) {
        int[][] values = {
                {4, 7, 2},
                {0, 3, 9},
                {4, 1, 5}
        };
        int sum = values[0][0] + values[1][1] + values[2][2];
        System.out.println(sum);
    }
}
