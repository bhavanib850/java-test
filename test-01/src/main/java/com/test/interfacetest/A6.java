package com.test.interfacetest;

public class A6 implements printable {
    @Override
    public void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {

        printable printable=new A6();
        printable.print();


    }
}
