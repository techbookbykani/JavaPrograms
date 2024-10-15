package com.tech.book.by.kani.java8.features.streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetLongestString {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("kani","mozhi","sharma","mani","babitha","anna","pushpam","kanimozhi","annapushpam");
        Optional<String> longestStr = strList.stream().reduce((str1,str2) -> str1.length() > str2.length() ? str1 :str2);
        longestStr.ifPresent(System.out::println);
    }
}
