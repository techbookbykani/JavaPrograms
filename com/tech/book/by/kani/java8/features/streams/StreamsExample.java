package com.tech.book.by.kani.java8.features.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        //Creating the instance of List
        List<String> cmpList = new ArrayList<>();
        cmpList.add("Microsoft");
        cmpList.add("Apple");
        cmpList.add("Google");
        // Sorting the list
        // using sorted() method and
        // printing using for-each loop

        cmpList.stream().sorted().forEach(
                System.out::println);
    }
}
