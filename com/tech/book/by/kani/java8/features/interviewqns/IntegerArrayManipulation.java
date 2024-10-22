package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerArrayManipulation {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
//        Arrays.stream(arr).forEach(p-> System.out.println(p *2));

        int[] arrnew = Arrays.stream(arr).map(a -> a * 2).filter(c -> c> 8).toArray();
        Arrays.stream(arrnew).forEach(System.out::println);
        int[] arrnew2 = Arrays.stream(arrnew).filter(b -> b >10).toArray();
        System.out.println("output");
        Arrays.stream(arrnew2).forEach(System.out::println);

        int arr2[] = {2,3,4,5,6,9,10};
//        Arrays.stream(arr2)

        List<Integer> newList = Arrays.stream(arr2).map(a -> a * 3).filter(c -> c > 20).boxed().collect(Collectors.toList());
    System.out.println("newList = "+newList);
    }
}
