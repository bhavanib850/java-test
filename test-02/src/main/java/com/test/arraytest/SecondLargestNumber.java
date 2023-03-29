package com.test.arraytest;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int array[]={20,4,80,60,40,70,76};

        int number=secondLargest(array);
        System.out.println(number);

    }

    public static int secondLargest(int[] arr) {

        // declare variables
        int fmax = 0;
        int smax = 0;

        // assign first element to fmax, smax
        fmax = arr[0];
        smax = arr[0];
       // int array[]={20,4,80,60,40,70,76};

        for (int i = 1; i < arr.length; i++) {
            if (fmax < arr[i]) {
                smax = fmax;
                fmax = arr[i];
            } else if(smax < arr[i]) {
                smax = arr[i];
            }
        }

        return smax;
    }
}
