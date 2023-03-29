package com.test.stringbuffertest;

public class GFG {
    public static void main(String[] args) {
        String str="Geeks", nstr="";
        char ch;
        System.out.println("Orinal word:"+str);
        for (int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;

        }
        System.out.println("Reverse word:"+nstr);

        //int a=Integer.parseInt("20");

    }
}
