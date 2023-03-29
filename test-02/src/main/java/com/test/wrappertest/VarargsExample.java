package com.test.wrappertest;

public class VarargsExample {

    static void myMethod(String... str){
        System.out.println("vargs");
    }

    public static void main(String[] args) {
        myMethod("a","b","c","d");
    }

}
