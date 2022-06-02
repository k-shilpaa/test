package com.employee;

public class Employee {
    private int age;
    private String name;
    private double salary;
    private int empId;

    public Employee(int age, String name, double salary, int empId) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                '}';
    }
}

