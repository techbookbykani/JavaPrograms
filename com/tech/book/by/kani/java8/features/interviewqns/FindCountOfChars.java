package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCountOfChars {
    public static void main(String[] args) {
        String str = "Kanimozhi";
        LinkedHashMap<String, Long> output = Arrays.stream(str.split(""))
                .map(String::valueOf)
                .collect(Collectors.groupingBy(st -> st, LinkedHashMap::new, Collectors.counting()));
        System.out.println("output = "+output);

        // or you can also try using Function.identify() instead of LinkedHashMap
        //in this order will not be maintained, if uou use LinkedHashMap::new order of the chars will be maintained
        Map<String, Long> output1 = Arrays.stream(str.split(""))
                .map(String::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("output1 = "+output1);

    }
}
