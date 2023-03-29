package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringListExpressionExample {

    public static void main(String[] args) {

        //Declare StringArray
        String[] stringArray = { "ab", "ef", "cd" };


        //Convert String Array to String List
        List<String> stringList = Arrays.asList(stringArray);

        //In Java 8 - Sort StringList using > Lambda expression - in one line
        Collections.sort(stringList, (a, b) -> b.compareTo(a));

        //Display StringList
        System.out.println(stringList);

    }


}
