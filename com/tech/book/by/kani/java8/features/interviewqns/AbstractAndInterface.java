package com.tech.book.by.kani.java8.features.interviewqns;

public interface AbstractAndInterface {
    default void print() {
        System.out.println(" Default print");
    }

    static void showMsg() {
        System.out.println("Shopwing the Msg ..");
    }
}
