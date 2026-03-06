package com.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Scientific Calculator...");
        System.out.println("==================================");

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int choice;
        do {
            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Show Menu");
            System.out.println("2. Power");
            System.out.println("3. Square Root");
            System.out.println("4. Factorial");
            System.out.println("5. Natural Logarithm");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1 -> {
                        continue;
                    }

                    case 2 -> {
                        System.out.print("Enter base: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter exponent: ");
                        double b = sc.nextDouble();
                        System.out.println("Result: " + calc.power(a, b));
                    }

                    case 3 -> {
                        System.out.print("Enter number: ");
                        double a = sc.nextDouble();
                        System.out.println("Result: " + calc.sqrt(a));
                    }

                    case 4 -> {
                        System.out.print("Enter integer: ");
                        int n = sc.nextInt();
                        System.out.println("Result: " + calc.factorial(n));
                    }

                    case 5 -> {
                        System.out.print("Enter number: ");
                        double a = sc.nextDouble();
                        System.out.println("Result: " + calc.ln(a));
                    }

                    case 6 -> System.out.println("Exiting...");

                    default -> System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);
        sc.close();
    }
}