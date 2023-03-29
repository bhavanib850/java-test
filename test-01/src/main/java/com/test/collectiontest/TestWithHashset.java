package com.test.collectiontest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class TestWithHashset {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ramu");
        Set<String> collection = new HashSet<>(list);
        collection.add("raju");
        collection.add("raju");
        collection.add("rani");
        System.out.println(collection);


        Set<Integer> set = new HashSet<>();
        set.add(29);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        // System.out.println(set);
    }
}
