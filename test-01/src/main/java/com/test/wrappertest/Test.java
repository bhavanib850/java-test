package com.test.wrappertest;

public class Test {
    public static void main(String[] args) {



        int i=10;

        Integer integer=Integer.valueOf(i);//auto boxing
        String input=integer.toString();
        System.out.println(input);

        String s="ravi";
        Integer i1=new Integer(s);
       // System.out.println(i1);

        Integer integer1=new Integer(10);

        int number=integer1.intValue();//un boxing
        System.out.println(number);

        double d=20.0;
        Double newData = new Double(d);
        int value = newData.intValue();


        int a=30;
        Double aDouble=new Double(a);
        double d1=aDouble.doubleValue();







    }
}
