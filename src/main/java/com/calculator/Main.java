package com.calculator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Calculator Service Running...");

        int a = 5;
        int b = 2;

        System.out.println("Power: " + Math.pow(a,b));
        System.out.println("Square Root: " + Math.sqrt(a));

        while(true){
            try {
                Thread.sleep(10000);
            } catch(Exception e) {}
        }

    }
}