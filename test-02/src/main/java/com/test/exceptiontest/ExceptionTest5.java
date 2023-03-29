package com.test.exceptiontest;

public class ExceptionTest5 {
    public static void main(String[] args) {
        System.out.println("method return -> "+m());
    }

    static String m(){
        try{
            int i=10/0; //will throw ArithmeticException
        }catch(ArithmeticException e){
            return "catch";
        }finally{
            return "finally";
        }

    }
}
