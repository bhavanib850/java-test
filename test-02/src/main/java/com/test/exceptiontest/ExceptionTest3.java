package com.test.exceptiontest;

import java.io.FileNotFoundException;

public class ExceptionTest3 {
    public static void main(String[] args) throws FileNotFoundException  {
        m();
        System.out.println("after calling m()");
    }
    static void m() throws FileNotFoundException  {

            throw new FileNotFoundException();



    }

}
