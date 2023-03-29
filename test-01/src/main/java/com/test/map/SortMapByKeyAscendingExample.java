package com.test.map;

import java.util.*;

public class SortMapByKeyAscendingExample {
    public static void main(String[] args){
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(4, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(5, 1);
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        List<Map.Entry<Integer, Integer>> listOfentrySet = new ArrayList<Map.Entry<Integer, Integer>>(entrySet);
        System.out.print("Before sorting by key : ");
        for(Map.Entry<Integer, Integer> entry:listOfentrySet){
            System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
        }

        Collections.sort(listOfentrySet, new SortByKeyAscending());


        System.out.print("\nAfter sorting by key(ascending): ");
        for(Map.Entry<Integer, Integer> entry:listOfentrySet)
            System.out.print(entry.getKey()+"="+entry.getValue()+"  ");


    }


    }

