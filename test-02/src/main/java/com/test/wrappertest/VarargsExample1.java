package com.test.wrappertest;

public class VarargsExample1 {

    static void myMethod(int... a){

        System.out.println("vargs");
    }
    static void myMethod(int a){
        System.out.println("primitive");
    }
    static void myMethod(Integer a){
        System.out.println("wrapper");
    }

    public static void main(String[] args) {
        myMethod(10);
    }

}
