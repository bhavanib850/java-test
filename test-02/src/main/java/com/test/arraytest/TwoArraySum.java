package com.test.arraytest;

public class TwoArraySum {
    public static void main(String[] args) {

        int array1[]={10,20,30,40,50,60};
        int array2[]={10,20,30,40,50,0};
        int array3[]=new int[array1.length];

        for (int i=0; i<array3.length; i++) {
            // add array elements
            array3[i] = array1[i] + array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);

        }
    }

}
