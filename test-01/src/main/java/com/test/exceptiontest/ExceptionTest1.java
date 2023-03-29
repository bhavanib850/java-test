package com.test.exceptiontest;

public class ExceptionTest1 {
    public static void main(String[] args) {

        try {
            int i = 10 / 5;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled in catch block");

        } finally {
            System.out.println("finally block executed");

        }
        System.out.println("code after try-catch-finally block");
    }

    }
