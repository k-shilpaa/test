package com.shilp.exercise;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 obj =new Ex4();
        obj.PrintFibonacci(6);

    }
    public void PrintFibonacci(int n){
        int a=0;
        int b=1;
            for(int i=0;i<n;i++){
                if(i==0){
                    System.out.println(a);
                }
                else if(i==1){
                    System.out.println(b);
                }
                else {
                    int c= a+b;
                    a=b;
                    b=c;



                    System.out.println(c);


                }


            }
        }
    }

