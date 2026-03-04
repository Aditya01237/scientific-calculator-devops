package com.calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculator Service Running...");
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 2;

        System.out.println("Power: " + calculator.power(a,b));
        System.out.println("Square Root: " + calculator.squareRoot(a));
        System.out.println("Factorial: " + calculator.factorial(a));
        System.out.println("Natural Log: " + calculator.naturalLog(a));

        while(true){
            try{
                Thread.sleep(10000);
            }catch(Exception e){}
        }
    }
}