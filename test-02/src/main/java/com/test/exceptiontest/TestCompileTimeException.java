package com.test.exceptiontest;

import java.io.FileNotFoundException;

public class TestCompileTimeException {
    public static void main(String[] args) throws FileNotFoundException {

        m1();
    }
    static void m1() throws FileNotFoundException{
        m2();
    }
    static void m2() throws FileNotFoundException{
        m3();
    }
    static void m3() throws FileNotFoundException{
        //file logic
        throw new FileNotFoundException("file not found in below location");
    }
}
