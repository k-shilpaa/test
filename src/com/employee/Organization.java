package com.employee;

import java.util.List;

public class Organization {
    private String name;
    private List<Employee> employees;

    public Organization(String name,List<Employee> employees){
        this.name =name;
        this.employees=employees;
    }

    @Override
    public String toString() {
        return "[" + "name='" + name + '\'' + ", employees=" + employees + ']';
    }
}

