package com.dmdev.l2;

/**
 * Задача 3: Типы данных и переполнение
 * Создайте программу, демонстрирующую переполнение типа данных byte. Выведите на экран результат переполнения.
 */
public class Task3 {
    public static void main(String[] args) {
        byte a = 30, b = 55;
        int mult = (byte)(a*b);
        System.out.println(mult);
    }
}
