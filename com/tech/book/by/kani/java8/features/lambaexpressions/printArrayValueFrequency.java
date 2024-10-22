package com.tech.book.by.kani.java8.features.lambaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class printArrayValueFrequency {
    public static void main(String[] args) {
        //List<Integer> arrValue = Arrays.asList(10, 3, 5, 2, 11, 10, 3, 2, 4, 3);
        int a[] = {10, 3, 5, 2, 11, 10, 3, 2, 4, 3};
        Map<Integer, Long> intarr = Arrays.stream(a).boxed().collect((Collectors.groupingBy(Integer::intValue, Collectors.counting())));
        System.out.println("Numbers & its Freq "+intarr);

        // other way using Identity

        Map<Integer, Long> intarr2 = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Numbers & its Freq 222=>"+intarr2);
        // to array
        Object[] resarr = intarr2.entrySet().toArray();
        System.out.println("Numbers & its Freq 222=>"+resarr);

    }
}
