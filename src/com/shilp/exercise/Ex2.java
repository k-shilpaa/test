package com.shilp.exercise;

public class Ex2 {
    public static void main(String[] args) {
        int i = 2;
        Ex2 obj = new Ex2();
        obj.print(i);


    }

    public void print(int n) {
        for (int i = 0; i < n; i++) {

            // for the upper half of the triangle
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i=0;i<n;i++){
            // for the lower half of the triangle
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}


