package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.*;

public class CompareEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(1,"kani","villukuri");
        Employee employee2 = new Employee(1,"Anna","chemparthi");
        Employee employee3 = new Employee(1,"Mani","kanyakumari");
        Employee employee4 = new Employee(1,"kani","chennai");
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        System.out.println("Before sorting ="+employeeList);
//         1. way (Using Lambda Expression)
//        Comparator<Employee> comp = (Employee emp1, Employee emp2) ->emp1.getName().compareTo(emp2.getName());
//         2. way (Using Lambda Expression omiiting type definition)
//        Comparator<Employee> comp = (emp1, emp2) ->emp1.getName().compareTo(emp2.getName());
//        3. way (Using Method Reference)
//        Comparator<Employee> comp = Comparator.comparing(Employee::getName);
//        4. way (Using Method Reference) & Reverse Compartor (i.e) reversing
//        Comparator<Employee> comp = Comparator.comparing(Employee::getName);
//        Comparator<Employee> revComp = comp.reversed();
//        5. way (Chaining The Comparator) Multiple Comparator
        Comparator<Employee> comp = Comparator.comparing(Employee::getName).thenComparing(Employee::getAddress);
        Collections.sort(employeeList,comp);
        System.out.println("After sorting ="+employeeList);

//        6. Parallel Sorting
        //Step 1:Create 100 Employees
        List<Employee> employeeList100 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
         employeeList100.add(new Employee(i,"orange","villukuri"));
        }
        for (int i = 50; i < 75; i++) {
            employeeList100.add(new Employee(i,"banana","chennai"));
        }
        for (int i = 75; i < 100; i++) {
            employeeList100.add(new Employee(i,"apple","chennai"));
        }
        for (int i = 100; i < 125; i++) {
            employeeList100.add(new Employee(i,"kiwi","chennai"));
        }
        for (int i = 125; i < 150; i++) {
            employeeList100.add(new Employee(i,"mango","chennai"));
        }
//Step 1:Printing 100 Employees
       // System.out.println("Before sorting 100 employeeList100 ="+employeeList100);
       //Converting ArrayList to Array
        Employee[] empArray = employeeList100.stream().toArray(Employee[]::new);
        long start = System.currentTimeMillis();
        System.out.println("start - time : "+start);
        Comparator<Employee> comp1 = Comparator.comparing(Employee::getName);
       // Collections.sort(employeeList100,comp1);
        Arrays.parallelSort(empArray,comp1);
        long end = System.currentTimeMillis();
        System.out.println("end - time : "+end);
        long timetaken1 = end - start;
        System.out.println("Time - time for sort-1: "+timetaken1);
       // System.out.println("After sorting 100 employeeList100 ="+employeeList100);
//        long end = System.currentTimeMillis();

    }
}
