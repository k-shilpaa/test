package com.shilp.exercise;

public class Ex8 {
    public static void main(String [] args){
        Ex8 obj=new Ex8();
        int fi;
        fi=obj.reverseInt(1225);
        System.out.println(fi);
        System.out.println(obj.isPalindrome(1551));
    }
    public int reverseInt(int s)
    {
        String result="";
        String a= Integer.toString(s);
        char[] b=a.toCharArray();
        for(int i=b.length-1;i>=0;i--){
             result= result+a.charAt(i);

        }
        int fi=Integer.parseInt(result);
        return fi;
    }
    public boolean isPalindrome(int s){
        if(reverseInt(s)==s){
            return true;
        }
        else {
            return false;
        }

    }

}
