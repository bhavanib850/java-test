package com.test.collectiontest;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {
    public static void main(String[] args) {
        List<String> collection=new CopyOnWriteArrayList<>();


        collection.add("raju");
        collection.add("raju");//allowed duplicates and index based, insertion order
        collection.add(0,"rani");

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

//        for (int i = 0; i <collection.size() ; i++) {
//            System.out.println(collection.get(i));
//
//        }

        //  System.out.println(collection);

        collection.set(0,"ramu");

        Iterator<String> iterator1=collection.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next()); //fail safe
            collection.add("ind");
        }

    }
}
