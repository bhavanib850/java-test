package com.test.exceptiontest;

public class ExceptionTest7 {
    public static void main(String[] args) {

        try{
            int i=10/1;//will throw ArithmeticException
            String s=null;
            s.length();
        }catch(ArithmeticException ae){
            System.out.println("Exception handled - ArithmeticException");
        }catch(RuntimeException re){
            System.out.println("Exception handled - RuntimeException");
        }catch(Exception e){
            System.out.println("Exception handled - Exception");
        }

    }
}
