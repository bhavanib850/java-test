package com.test.wrappertest;

public class VaragsExample1 {
    static void myMethod(int ...a){
        System.out.println("varags");
    }
    static void myMethod(int a){ System.out.println("primitive"); }
    static void myMethod(Integer a) { System.out.println("wrapper");}

    public static void main(String[] args) { myMethod(10); }

    }


