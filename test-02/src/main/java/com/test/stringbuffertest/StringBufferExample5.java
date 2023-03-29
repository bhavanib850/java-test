package com.test.stringbuffertest;

public class StringBufferExample5 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);


        String s="bhavani";
        StringBuffer stringBuffer=new StringBuffer(s);
       String reverseString =stringBuffer.reverse().toString();
        System.out.println(reverseString);
    }
}
