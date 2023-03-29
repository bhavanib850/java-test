package com.test.interfacetest;

interface Showable{
    void print();
}
interface Printable{
    void print();
}
public class TestInterface3 implements printable, Showable{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}


