package com.institution;

import java.util.ArrayList;
import java.util.List;

public class Institution {
    private String name;
    private List<Department> departments;

    @Override
    public String toString() {
        return "Institution{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }

    public Institution(String name, List<Department> departments){
        this.name =name;
        this.departments= departments;

    }

}
