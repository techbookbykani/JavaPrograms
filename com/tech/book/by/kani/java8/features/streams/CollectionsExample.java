package com.tech.book.by.kani.java8.features.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        //Creating the instance of List
        List<String> cmpList = new ArrayList<>();
        cmpList.add("Microsoft");
        cmpList.add("Apple");
        cmpList.add("Google");
        //Now creating the compartor
        Comparator<String> com = (String o1, String o2)-> o1.compareTo(o2);
        //Sorting the list
        Collections.sort(cmpList,com);
        for (String name: cmpList) {
            System.out.println(name);
        }
    }
}
