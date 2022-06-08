package com.shilp.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest obj = new ExceptionTest();
        obj.doSomething();
        try {
            obj.doSomething();


        }finally {
            System.out.println("calling finally");
        }


        // 1000 lines
        System.out.println("running 1000 lines");


    }

    public void doSomething() {


        // 1000

       throw new NullPointerException("my exception");
    }
}
