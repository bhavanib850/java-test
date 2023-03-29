package com.test.supertest;

public class SubClass extends SuperClass {
    SubClass(String message) {
        super(message);

    }
      void showOne(){
        show();
      }
       void showTwo(){
           System.out.println(super.message);
       }
}
