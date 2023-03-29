package com.test.collectiontest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Graps");
        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
