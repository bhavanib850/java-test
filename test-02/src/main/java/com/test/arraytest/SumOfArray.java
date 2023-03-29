package com.test.arraytest;

public class SumOfArray {

    public static void main(String[] args) {
        int arr[]={10,20,30,40};

        int sum=sum(arr);
        System.out.println(sum);
    }

    private static int sum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];

        }
        return sum;
    }

}
