package com.test.collectiontest;

import java.util.*;

public class Test {
    public static void main(String[] args) {


        List<String> collection= new ArrayList();



        collection.add("raju");
        collection.add("raju");//allowed duplicates and index based,insertion order
        collection.add(0,"rani");


        collection.set(0,"ramu");


//        Iterator<String> iterator=collection.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//        Iterator<String> iterator1=collection.iterator();
//        while(iterator1.hasNext()){
//            System.out.println(iterator1.next());//fail fast
//            collection.add("ind");
//        }

//        Enumeration<String> listEnum=Collections.enumeration(collection);
//        while(listEnum.hasMoreElements()){
//            System.out.println(listEnum.nextElement());
//        }


//        for (String string : collection) {
//            System.out.println(string);
//        }

        for (int i = 0; i <collection.size() ; i++) {
            System.out.println(collection.get(i));

        }

      //  System.out.println(collection);

    }
}
