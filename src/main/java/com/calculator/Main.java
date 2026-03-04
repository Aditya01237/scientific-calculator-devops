package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter number: ");
                        double num = sc.nextDouble();
                        System.out.println("Result = " + calculator.squareRoot(num));
                        break;

                    case 2:
                        System.out.print("Enter number: ");
                        int n = sc.nextInt();
                        System.out.println("Result = " + calculator.factorial(n));
                        break;

                    case 3:
                        System.out.print("Enter number: ");
                        double logNum = sc.nextDouble();
                        System.out.println("Result = " + calculator.naturalLog(logNum));
                        break;

                    case 4:
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();

                        System.out.print("Enter exponent: ");
                        double exp = sc.nextDouble();

                        System.out.println("Result = " + calculator.power(base, exp));
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid option");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

    }
}