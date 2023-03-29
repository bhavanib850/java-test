package com.test.java8;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionExample11 {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "Samsung A5", 17000f));
        list.add(new Product(3, "Iphone 6S", 65000f));
        list.add(new Product(2, "Sony Xperia", 25000f));
        list.add(new Product(4, "Nokia Lumia", 15000f));
        list.add(new Product(5, "Redmi4 ", 26000f));
        list.add(new Product(6, "Lenevo Vibe", 19000f));


//        for(Product product:list){
//
//            if(product.price>20000){
//                System.out.println(product.name);
//            }
//        }


        list.stream()
                .filter(p -> p.price > 20000)
                .forEach(e -> System.out.println(e.name));
    }
}