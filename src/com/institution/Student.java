package com.institution;

public class Student {
    private int age;
    private String name;
    private int studentId;



    public Student(int age, String name, int studentId){
        this.age = age;
        this.name= name;
        this.studentId=studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}

