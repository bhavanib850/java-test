package com.test.collectiontest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestWithLinkedHashset {
    public static void main(String[] args) {


        Set<String> collection= new LinkedHashSet<>();

        collection.add("raju");
        collection.add("raju");
        collection.add("rani");

       // System.out.println(collection);


        Set<Integer> set=new LinkedHashSet<>();
        set.add(29);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        set.add(null);



        System.out.println(set);




    }
}
