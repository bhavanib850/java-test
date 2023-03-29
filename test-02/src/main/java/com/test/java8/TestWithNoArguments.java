package com.test.java8;

interface FuncInterface1
{
    // An abstract function
    void abstractFun();


    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }

public class TestWithNoArguments {
    public static void main(String[] args) {
        FuncInterface1 fobj = ()->System.out.println("hi");
        fobj.abstractFun();
    }
}
}
