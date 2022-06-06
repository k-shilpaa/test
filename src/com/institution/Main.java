package com.institution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(5, "eb", 55);
        Student s2 = new Student(10, "bee", 21);
        List<Student> eceStudents = new ArrayList<>();
        eceStudents.add(s1);
        eceStudents.add(s2);

        Student s3 = new Student(5, "el", 55);
        Student s4 = new Student(10, "vecna", 21);
        List<Student> compStudents = new ArrayList<>();
        compStudents.add(s3);
        compStudents.add(s4);

        Department dep1 = new Department("Electronics", eceStudents);
        Department dep2 = new Department("Computer", compStudents);
        List<Department> departments = new ArrayList<>();
        departments.add(dep1);
        departments.add(dep2);

        Institution ins = new Institution("sh", departments);
        System.out.println("institution is " + ins);
    }
}
