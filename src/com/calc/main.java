package com.calc;

public class main {
    public static void main(String[] args) {
        CalculatorImpl newCalculator=new CalculatorImpl();
         System.out.println(newCalculator.add(4,5));
        System.out.println(newCalculator.subtract(7,11));
        System.out.println(newCalculator.multiply(1,2));
        System.out.println(newCalculator.divide(4,0));
    }
}
