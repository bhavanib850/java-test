package com.test.interfacetest;

public class A6 implements Printable {
    @Override
    public void print() {
        System.out.println("print");
    }

    public static void main(String[] args) {

        Printable printable=new A6();
        printable.print();
    }
}
