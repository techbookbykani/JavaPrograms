package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        int arr[] = {12, 56,98,24, 99};
        Arrays.stream(arr).sorted().forEach(System.out::println);

        //other way
        List<Integer> output = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        System.out.println("output = "+output);

        // desc sort
        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
        //other way
        List<Integer> output1 = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("output1 = "+output1);
    }
}
