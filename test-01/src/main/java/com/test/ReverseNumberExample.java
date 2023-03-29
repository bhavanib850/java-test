package com.test;

public class ReverseNumberExample {
    public static void main(String[] args) {

        int number = 14567;
        System.out.println("Original number:"+number);
        System.out.println("Reverse number:"+reverseNumber(number));
    }
    public static int reverseNumber(int number){
        int reverse=0;
        int remainder;
        while(number>0){
            remainder=number%10;
            number=number/10;
            reverse=reverse*10+remainder;
        }
        return reverse;
    }

}
