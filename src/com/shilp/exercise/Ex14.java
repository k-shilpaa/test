package com.shilp.exercise;

public class Ex14 {
    public static void main(String[] args) {
        int key=5;
        int[] arr = {1, 2, 3, 4, 25, 8, 7,95,11,15,12,5};
        Ex14 obj = new Ex14();
        obj.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[index]) {
                    index = j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }

    }
}
