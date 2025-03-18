package com.dmdev.l2;

/**
 * Задача 7: Рекурсивный метод
 * Напишите рекурсивную функцию, которая вычисляет факториал заданного числа. Добавьте условие выхода из рекурсии и
 * выведите результат работы функции.
 */
public class Task7 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
