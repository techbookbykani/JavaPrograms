package com.tech.book.by.kani.java8.features.interviewqns;

public class AbstractAndInterfaceDemo extends AbstractAndInterfaceEgClass implements AbstractAndInterface, InterfaceEg {
    public static void main(String[] args) {
        AbstractAndInterfaceDemo abEg = new AbstractAndInterfaceDemo();
        abEg.print();
        AbstractAndInterface.showMsg();

    }

    @Override
    void print1() {
        System.out.println(" Override Print...");
    }

    @Override
    public void print() {
        System.out.println(" concrete Print");
    }
}
