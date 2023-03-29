package com.test.wrappertest;

public class VaragsExample2 {
    static void myMethod(String a) { System.out.println("String");}
    static void myMethod(Object a) { System.out.println("Object"); }

    public static void main(String[] args) {
        myMethod("ravi");
        myMethod(null);
        myMethod(new String("ravi"));
        myMethod(new StringBuffer("raju"));
    }
    }

