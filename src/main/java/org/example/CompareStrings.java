package org.example;
import java.util.Scanner;

//2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их. В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String a = scanner.nextLine();

        System.out.println("Enter the second string:");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Strings are identical.");
        } else {
            System.out.println("Strings are not identical.");
        }
    }
}
