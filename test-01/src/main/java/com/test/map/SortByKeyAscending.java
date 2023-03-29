package com.test.map;

import java.util.Comparator;
import java.util.Map;

public class SortByKeyAscending implements Comparator<Map.Entry<Integer,Integer>> {
    @Override
    public int compare(Map.Entry<Integer,Integer>entry1,Map.Entry<Integer,Integer> entry2){
        return (entry1.getKey().compareTo(entry2.getKey()));

    }
}
