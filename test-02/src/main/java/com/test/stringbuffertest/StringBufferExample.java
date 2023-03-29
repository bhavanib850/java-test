package com.test.stringbuffertest;

public class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java").append(" ").append("test").append(" ").append("java");//now original string is changed
        System.out.println(sb);
    }
}
