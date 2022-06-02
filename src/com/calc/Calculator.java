package com.calc;

public abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            return -1;
        } else {
            return a / b;
        }

    }
}

