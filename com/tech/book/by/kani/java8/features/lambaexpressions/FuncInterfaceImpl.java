package com.tech.book.by.kani.java8.features.lambaexpressions;

public class FuncInterfaceImpl {
    public static void main(String[] args) {

        //Lambda Expression for the FuncInterface Implementaion for the abstractFun
        FuncInterface funcInterface = (int x) -> System.out.println(2*x);
        funcInterface.abstractFun(5);
        //calling default interface method -normalFunc
        funcInterface.normalFunc();
        funcInterface.normalFuncer();
    }
}
