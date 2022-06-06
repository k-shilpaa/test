package com.institution;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List <Student>students;

    private String name;

    @Override
    public String toString() {
        return "Department{" +
                "students=" + students +
                ", name='" + name + '\'' +
                '}';
    }

    public Department(String name, List<Student> students){
        this.students = students;
        this.name = name;


    }
}
