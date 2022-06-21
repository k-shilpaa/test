package com.shilp.exercise;

public class Ex13 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8, 25, 3, 7};
        Ex13 obj = new Ex13();
        obj.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }
}
