package com.dmdev.l2;

/**
 * Задача 4: Работа с типами и явное приведение
 * Создайте программу, которая явно преобразует число типа double в тип int. Продемонстрируйте, какие потери данных при
 * этом происходят.
 */
public class Task4 {
    public static void main(String[] args) {
        double a = 12.44;
        int b = (int)a;
        System.out.println(b);
    }
}
