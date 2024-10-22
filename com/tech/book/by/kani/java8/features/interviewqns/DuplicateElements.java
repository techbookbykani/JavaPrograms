package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = {12, 56,98,24, 99, 99,56,99};
      //  List<Integer> intList = Arrays.asList(arr).stream().toList();

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

        Arrays.stream(arr).distinct().forEach(a -> System.out.println(a));

        Set<Integer> setvalue = Arrays.stream(arr).boxed().collect(Collectors.toSet());
System.out.println("setvalue ="+setvalue);
        //Arrays.stream(arr).filter(x-> Collections.frequency(arr,x)>1)
        Set<Integer> setval = new HashSet<>();
        System.out.println("dup val ="+Arrays.stream(arr).filter(d -> !setval.add(d)).boxed().collect(Collectors.toList()));

        System.out.println("mal val ="+Arrays.stream(arr).map(a -> a * 2).filter(z -> z > 196).boxed().collect(Collectors.toList()));


        System.out.println("Arr dup grping ="+Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

    }
        }


