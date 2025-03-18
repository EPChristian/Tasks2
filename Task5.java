package com.dmdev.l2;

/**
 * Задача 5: String и конкатенация
 * Создайте цикл, в котором 10 раз к одной строке конкатенируется другая строка. Замерьте и сравните время выполнения с
 * использованием String и StringBuilder.
 */
public class Task5 {
    public static void main(String[] args) {
//        long startTime = System.nanoTime();
//        String str1 = "Только ";
//        String str2 = "вперёд! ";
//        System.out.println(str1+str2+str2+str2+str2+str2+str2+str2+str2+str2+str2);
//        long endTime = System.nanoTime();
//        System.out.println("String: " + (endTime - startTime) / 1_000_000.0 + " ms");

        long startTime = System.nanoTime();
        StringBuilder strA = new StringBuilder("Только ");
        for (int i = 0; i < 10; i++) {
            strA.append("вперёд! ");
        }
        System.out.println(strA.toString());
        long endTime = System.nanoTime();
        System.out.println("StringBuilder: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
