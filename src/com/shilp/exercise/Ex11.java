package com.shilp.exercise;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

public class Ex11 {
    public static int age = 5;



    public static void main(String[] args) {
        age = age + 5;
        Ex11.ex();
        Ex11 obj=new Ex11();
        obj.meth();



    }

    public void meth() {
        age = age + 5;
        ex();
    }
    public static void ex(){


    }


}
