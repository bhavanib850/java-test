package com.test.supertest;

public class SuperClass {

    String message;
    SuperClass(String message){
        this.message=message;

    }

    public String getMessage(){
        return message;
    }

    public void show(){
        System.out.println("show super method");
    }

}
