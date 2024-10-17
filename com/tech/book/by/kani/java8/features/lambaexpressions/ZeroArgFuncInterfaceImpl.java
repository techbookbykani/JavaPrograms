package com.tech.book.by.kani.java8.features.lambaexpressions;

public class ZeroArgFuncInterfaceImpl {
    public static void main(String[] args) {
        ZeroArgFuncInterface zeroArg = () -> System.out.println("Printing Zero Arg FuncInterface Test");
        zeroArg.printFunc();
    }
}
