package com.tech.book.by.kani.java8.features.lambaexpressions;

public class OneArgFuncInterfaceImpl {
    public static void main(String[] args) {
        OneArgFuncInterface oneArgIntf = (name) -> {
            return "hi "+ name;
        };

        System.out.println(oneArgIntf.sayHello("kani"));
    }
}
