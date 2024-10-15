package com.tech.book.by.kani.java11.features;

import java.util.stream.Collectors;

public class NewStringMethods {
    public static void main(String[] args) {
        String str1 = "";
        System.out.println(str1.isBlank());
        String str2 = "kanimozhi";
        System.out.println(str2.isBlank());
        String str3 = "kani\nMozhi";
        System.out.println(str3.lines().collect(Collectors.toList()));
        String str4 = "Kani";
        System.out.println(str4.repeat(3));
        String str5 = "Kani";
        System.out.println(str5.stripIndent());
        String str6 = "Kani";
        System.out.println(str6.stripTrailing());
        String str7 = " Kani ";
        System.out.println(str7.stripLeading());
        String str8 = " Kani  ";
        System.out.println(str8.strip());

    }
}
