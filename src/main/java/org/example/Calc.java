package org.example;
import java.util.Scanner;


//1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции над числами
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        if (b != 0) {
            System.out.println("Частное: " + ((double) a / b));
        } else {
            System.out.println("Деление на 0 невозможно");
        }
        System.out.println("Произведение: " + (a * b));
    }
}
