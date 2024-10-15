package com.tech.book.by.kani.java8.features.lambaexpressions;

import java.util.ArrayList;

//Class to demonstrate a simple Lambda Expressions
public class SimpleLambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);
        //Using all the elements to print the Array
        intArr.forEach(n->System.out.println(n));
        //Using all the elements to print the Array with some calc
        System.out.println("Printing Array values after calc");
        intArr.forEach(n->{
            if(n % 2 == 0) {
                System.out.println(n);
            }
        });

    }
}
