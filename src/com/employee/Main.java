package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Employee emp1= new Employee(6,"hi",5,011);

        Employee emp2=new Employee(9,"hello",10,001);
        List<Employee> empList= new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        Organization org= new Organization("shil",empList);
        System.out.println("Organization is " + org);
    }

}
