package com.tech.book.by.kani.java8.features.interviewqns;

import java.util.*;
class Producta {
    int id;
    String name;
    float price;

    public Producta(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Producta{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class CheckListIsEmptyElsePrint {
    public static void main(String[] args) {
        List<String> vegList = Arrays.asList("Brinjal","Carrot","potato","LadyFinger","Pumkin",
                "cabbage","Peas","Chilli");
        Optional<Object> justPrintOptional = Optional.of(vegList);
        System.out.println("just for Printing Optional ="+justPrintOptional);

        List<Producta> prodsa = new ArrayList<>();
        prodsa.add(new Producta(1,"kani",123));
        prodsa.add(new Producta(2,"mozhi",123));
                Optional.ofNullable(prodsa)
                .orElseGet(Collections::emptyList)
                .stream().filter(Objects::nonNull)
                        .map(pro -> pro.name)
                .forEach(System.out::println);

    }
}
