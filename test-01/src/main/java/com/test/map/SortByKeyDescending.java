package com.test.map;

import java.util.Comparator;
import java.util.Map;

public class SortByKeyDescending implements Comparator<Map.Entry<Integer,Integer>>{
@Override
public int compare(Map.Entry<Integer,Integer>entry1,Map.Entry<Integer,Integer>entry2){
return(entry2.getKey().compareTo(entry1.getKey()));
}
}