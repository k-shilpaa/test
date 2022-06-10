package com.shilp.exercise;

import com.shilp.exception.ExceptionTest;

public class Ex3 {
    public static void main(String args[]) {
        Ex3 ex = new Ex3();
        ex.printPrime(10);


        //System.out.println(ex.isPrime(11));


    }

    private boolean isOdd(int i) {
        return (i % 2 == 0) ? false : true;

    }

    public boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public void printPrime(int n){
        for(int i=0;i<n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}



