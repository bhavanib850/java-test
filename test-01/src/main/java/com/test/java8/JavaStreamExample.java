package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ProductResponse {
    int id;
    String name;
    float price;
    public ProductResponse(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<ProductResponse> productList = new ArrayList<>();
        //Adding Products
        productList.add(new ProductResponse(1,"hp Laptop", 25000f));
        productList.add(new ProductResponse(2,"hp Laptop", 30000f));
        productList.add(new ProductResponse(3,"hp Laptop", 28000f));
        productList.add(new ProductResponse(4,"hp Laptop", 28000f));
        productList.add(new ProductResponse(5,"hp Laptop", 90000f));
        List<Float> productPriceList = new ArrayList<>();
        List<String> productPriceList2= productList.stream()
                .filter(p -> p.price>30000)// filtering data
                .map(p->p.name)           // filtering price
                .collect(Collectors.toList());
        System.out.println(productPriceList2); // displaying data


    }
}
