package com.tech.book.by.kani.java8.features.interviewqns;

public class ObjectCheckImpl {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        ObjectCheck objectCheck = (a1, b1) -> a1.equals(b1);

        System.out.println("Is Two Objects are Equals: "+objectCheck.objectCheckEquals(a,b));

    }
}
