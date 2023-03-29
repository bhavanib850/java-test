package com.test.inheritancetest;

public class Test1 {
    public static void main(String[] args) {
        Lion lion=new Lion();
        //lion.food();

        Goat goat=new Goat();
       // goat.food();

        Animal1 animal1=new Animal1();
       // animal1.food();

        Cat cat=new Cat();
        //cat.food();

        Animal1 animal12=new Cat();
       // animal12.food();

        Animal1 animal13=new Lion();
        //animal13.food();

        Animal1 animal14=new Goat();
        animal14.food();
    }
}
