package com.shilp.exercise;

public class Ex15 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 2};
        Ex15 obj = new Ex15();
        obj.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }

    }
}
