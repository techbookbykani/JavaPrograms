package com.tech.book.by.kani.java8.features.lambaexpressions;

public class FuncInterfaceImpl1 {
    public static void main(String[] args) {
        // Using lambda expressions to define the operations
        FuncInterface1 sum = (a,b) -> a+ b;
        FuncInterface1 mul = (a,b) -> a * b;
        // Using the operations
        System.out.println("sum="+sum.operation(5,3));
        System.out.println("mul="+mul.operation(5,3));
    }
}
