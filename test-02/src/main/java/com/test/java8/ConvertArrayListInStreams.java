package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListInStreams {
    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("ank");
        stringList.add("sam");
        stringList.add("az");
        stringList.add("neh");
        stringList.add("ad");


//        stringList.stream() // Convert list (ArrayList) to Stream
//                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
//                .forEach(System.out::println);


        stringList.stream() // Convert list to Stream
                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
                .sorted()  //SORT the list (ASCENDING order)
                .forEach(System.out::println);



//        stringList.stream() // Convert list to Stream
//                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
//                .sorted((a, b) -> b.compareTo(a))  //SORT the list (DESCENDING order)
//                .forEach(System.out::println);



        stringList.stream()
                .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
                .map(String::toUpperCase) //CONVERT to UPPERCASE
                .sorted()  //SORT the list (ASCENDING order)
                .forEach(System.out::println);
    }
}
