package com.test.objectclassmethods;

public class Test {

    public static void main(String[] args) {

        Test test=new Test();
        int code=test.hashCode();
        Class aClass=test.getClass();
        System.out.println(aClass.getName());
        System.out.println(code);
    }
}
