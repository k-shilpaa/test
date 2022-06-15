package com.shilp.exercise;

import java.util.Locale;

public class Ex6 {
    public static void main(String[] args) {
       String s="aba";
       Ex6 obj=new Ex6();
       String result=obj.reverseString(s);
        System.out.println(result);
        System.out.println(obj.isPalindrome(s));

        /*System.out.println(s.charAt(3));
        System.out.println(s.codePointAt(3));
        System.out.println(s.codePointBefore(1));
        System.out.println(s.lastIndexOf('i'));
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(1,3));
        System.out.println(s.replace("h","p"));
        System.out.println(s.trim());
        System.out.println(s.split("l"));
*/
    }
    public String reverseString(String s){
        char[] b =s.toCharArray();
        int a=b.length;
        String result ="";
        for(int i=a-1;i>=0;i--){
            result=result+s.charAt(i);
        }
        return result;
    }
    public boolean isPalindrome(String s){
        if (reverseString(s).equals(s)){
            return true;
        }
        else {
            return false;
        }

    }
}
