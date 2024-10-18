package com.tech.book.by.kani.java8.features.lambaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product {
int id;
String name;
float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Samsung", 1000));
        productList.add(new Product(2,"Apple", 55000));
        productList.add(new Product(3,"Dell", 19000));
        productList.add(new Product(4,"HP", 9000));
        productList.add(new Product(5,"Sony", 20000));
        productList.add(new Product(6,"Acer", 33000));

        System.out.println("Before Sorting the Products => "+productList);
        Collections.sort(productList,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        System.out.println("After Sorting the Products => "+productList);
        System.out.println("Printing in eachline ...");

        //Printing in two lines
        Stream<Product> prods = productList.stream().filter(p -> p.price > 2000);
        prods.forEach(product -> System.out.println("product =>"+product));

        //Printing in a single - line
        productList.stream().filter(p -> p.price > 33000).forEach(System.out::println);

    }
}