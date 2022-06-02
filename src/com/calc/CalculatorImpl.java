package com.calc;

public class CalculatorImpl implements Calculator {


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {

        if (b == 0) {
            return -1;
        } else {
            return a / b;
        }


    }
}

