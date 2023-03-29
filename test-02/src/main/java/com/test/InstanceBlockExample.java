package com.test;

public class InstanceBlockExample {

    {
        //this.m1();
        System.out.println("non static block 1");
    }

    {
        System.out.println(" non static block 2");
    }
    static {
        //this.m1();
        System.out.println("static");
    }

    public static void m1(){
        System.out.println("m1");
    }

    public InstanceBlockExample() {
        System.out.println("Class constructor");
    }

    public static void main(String[] args) {
        InstanceBlockExample iib = new InstanceBlockExample();
        //InstanceBlockExample iib1 = new InstanceBlockExample();
        //InstanceBlockExample iib2 = new InstanceBlockExample();
        System.out.println("Main Method");
    }
}