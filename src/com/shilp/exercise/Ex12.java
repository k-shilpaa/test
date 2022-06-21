package com.shilp.exercise;

public class Ex12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = arr.length;
        Ex12 returnElement = new Ex12();
        int result = Ex12.returnElement(arr,1,arr.length-1,0);
        System.out.println(result);
    }

    public static int returnElement(int[] arr, int key, int high, int low) {
        while(low<=high) {
            int mid = (high + low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key<arr[mid]) {
                high= mid - 1;
            }
             else {
                low = mid + 1;
            }
        }
        return -1;
    }
}