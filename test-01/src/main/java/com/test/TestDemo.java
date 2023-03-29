package com.test;

public class TestDemo {
    TestDemo() {System.out.println("default"); }
    {
        System.out.println("non static block");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {

        //StaticTest staticTest=new StaticTest();

    }

    }

