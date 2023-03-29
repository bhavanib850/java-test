package com.test.exceptiontest;
import java.io.FileNotFoundException;
public class TestRuntimeException {
    public static void main(String[] args) {
        m1();

    }
    static void m1() { m2(); }
    static void m2() { m3(); }
    static void  m3(){
        throw new NullPointerException("file not found in below location");
    }

}

