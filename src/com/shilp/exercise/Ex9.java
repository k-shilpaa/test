package com.shilp.exercise;

public class Ex9 {
    public static void main(String[] args) {
        Ex9 obj = new Ex9();
        String s = "aba";
        System.out.println(obj.palindromeNew(s));
    }

    public boolean palindromeNew(String n) {
        int l = n.length();
        for (int i = 0; i <= l / 2; i++) {
            if (n.charAt(i) != n.charAt(l - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
