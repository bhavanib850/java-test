package com.test.abstracttest;

class Maruthi extends Bike{
    void run(){
        System.out.println("running safely");
    }
    public static void main(String args[]){
        Bike obj = new Maruthi();
        obj.run();
    }
}
