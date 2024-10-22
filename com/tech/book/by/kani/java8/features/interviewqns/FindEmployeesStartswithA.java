package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmployeesStartswithA {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"anna","villukuri"));
        empList.add(new Employee(2,"rose","villukuri"));
        empList.add(new Employee(3,"shar","villukuri"));
        empList.add(new Employee(4,"mani","villukuri"));
        empList.add(new Employee(5,"abie","villukuri"));
        empList.add(new Employee(6,"ayla","villukuri"));
        empList.add(new Employee(7,"pink","villukuri"));

        List<Employee> aempList = empList.stream().filter(emp -> emp.getName().startsWith("a")).collect(Collectors.toList());
        System.out.println("aempList ="+aempList);

        System.out.println("aempList count="+empList.stream().count());
    }
}
