package com.calculator;

public class Calculator {

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        if (a < 0)
            throw new IllegalArgumentException("Negative square root");
        return Math.sqrt(a);
    }

    public long factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Negative factorial");

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double ln(double a) {
        if (a <= 0)
            throw new IllegalArgumentException("Invalid log input");
        return Math.log(a);
    }
}