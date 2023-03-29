package com.test.exceptiontest;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        }catch(Exception e){
            System.out.println("Exception handled  properly in catch block");
        }
        System.out.println("Code after exception handling");
    }
    }

