package com.tech.book.by.kani.java8.features.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1,3,9,1,2);
        Optional<Integer> sum = numbers.stream().reduce((number1, number2) -> number1 + number2);
        sum.ifPresent(System.out::println);
    }
}
