package com.dmdev.l2;
import java.util.Scanner;

/**
 * 1. Задача 1: Перевод чисел
 *  * Напишите программу, которая принимает число в десятичной системе и выводит его двоичное представление, а также
 *  * принимает число в двоичной системе и выводит его десятичное представление.
 */
public class Task1 {
    public static void main(String[] args) {
        bin();
        num();
    }

        public static void bin() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите двоичное число: ");
            String binary = scanner.next(); // Ввод числа в двоичной системе

            int length = binary.length(); // Длина числа

            int result = 0;
            for (int i = 0; i < length; i++) {
                int digit = Character.getNumericValue(binary.charAt(i)); // Получаем 0 или 1
                result += digit * (int) Math.pow(2, length - 1 - i); // Умножаем на 2^в нужной степени
            }
            System.out.println("Это число в десятичной системе: " + result);
        }
        public static void num() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите десятичное число: ");
            int number = scanner.nextInt(); // Ввод числа в десятичной системе

            if (number == 0) {
                System.out.println("Двоичное представление: 0");
                return;
            }

            StringBuilder binary = new StringBuilder();
//          String binary = "";

            while (number > 0) {
                int between = number % 2; // Остаток от деления на 2 (0 или 1)
                binary.insert(0, between); // Добавляем в начало строки
//              binary = between + binary; // Добавляем в начало строки
                number /= 2; // Делим число на 2
            }
            System.out.println("Двоичное представление: " + binary);
        }
}
