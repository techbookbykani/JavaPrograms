package com.tech.book.by.kani.java8.features.lambaexpressions;

public class TwoArgFuncInterfaceImpl {
    public static void main(String[] args) {
        TwoArgFuncInterface addFunc = (a, b) -> {
          return (a + b);
        };

        TwoArgFuncInterface mulFunc = (a, b) -> {
            return (a * b);
        };

        System.out.println("--- Calc ---");

        System.out.println(" -- Add => "+ addFunc.calc(2, 3));

        System.out.println(" -- Mul => "+ mulFunc.calc(2, 3));
    }
}
