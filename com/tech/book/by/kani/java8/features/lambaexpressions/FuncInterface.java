package com.tech.book.by.kani.java8.features.lambaexpressions;
//Functional Interface
public interface FuncInterface {
    //abstract function
    void abstractFun(int x);
    //non-abstract or default function
    default void normalFunc(){
        System.out.println("Hello");
    }
    default void normalFuncer(){
        System.out.println("Hello fgf");
    }
}
