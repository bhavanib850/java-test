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
        List<ProductResponse> productsList = new ArrayList<ProductResponse>();
        //Adding Products
        productsList.add(new ProductResponse(1,"HP Laptop",25000f));
        productsList.add(new ProductResponse(2,"Dell Laptop",30000f));
        productsList.add(new ProductResponse(3,"Lenevo Laptop",28000f));
        productsList.add(new ProductResponse(4,"Sony Laptop",28000f));
        productsList.add(new ProductResponse(5,"Apple Laptop",90000f));
        List<Float> productPriceList = new ArrayList<Float>();
        List<String> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.name)        // fetching price
                .collect(Collectors.toList());
        System.out.println(productPriceList2);   // displaying data
    }
}
