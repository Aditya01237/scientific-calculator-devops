package com.calculator;

public class Calculator {

    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number");
        }
        return Math.sqrt(x);
    }

    public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }

        long result = 1;

        for (int i = 1; i <= x; i++) {
            result *= i;
        }

        return result;
    }

    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Log undefined for zero or negative numbers");
        }
        return Math.log(x);
    }

    public double power(double x, double b) {
        return Math.pow(x, b);
    }
}