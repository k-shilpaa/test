package com.shilp.exercise;

import com.shilp.exception.ExceptionTest;

import java.util.Arrays;

public class Ex5 {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,5};

        Ex5 obj=new Ex5();
        int[] result = obj.reverseArray(arr );
        System.out.println(Arrays.toString(result));
    }
    public int[] reverseArray(int[] arr){
        int[] result =new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            result [arr.length-i-1] =arr[i];

        }

        return result;

    }

}
