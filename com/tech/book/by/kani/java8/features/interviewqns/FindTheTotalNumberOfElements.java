package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.Arrays;

public class FindTheTotalNumberOfElements {
    public static void main(String[] args) {
        int arr[] = {12, 56,98,24, 99};
        long count = Arrays.stream(arr).count();
        System.out.println("Count = "+count);
    }
}
