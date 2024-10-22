package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.Arrays;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {12, 56,98,24, 99};
        int output = Arrays.stream(arr).max().getAsInt();
        System.out.println(" output => "+output);
    }
}
