package com.tech.book.by.kani.java8.features.lambaexpressions;

import java.util.Arrays;
import java.util.List;

public class ForEachLoopLambdaExp {
    public static void main(String[] args) {
        List<String> vegList = Arrays.asList("Brinjal","Carrot","potato","LadyFinger","Pumkin",
                "cabbage","Peas","Chilli");

        vegList.forEach(veg -> System.out.println(veg));

    }
}
