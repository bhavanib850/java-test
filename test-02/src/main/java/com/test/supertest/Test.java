package com.test.supertest;

public class Test {
    public static void main(String[] args) {

        SubClass subClass=new SubClass("testing super");

        String message=subClass.getMessage();
        System.out.println(message);
        subClass.showOne();
        subClass.showTwo();




    }
}
