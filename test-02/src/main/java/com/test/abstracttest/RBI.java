package com.test.abstracttest;

abstract class RBI {

    abstract double getPersonalInterestRate();

    abstract double getHomeInterestRate();

    void getAccountInfo(){
        System.out.println("account info");
    }


}
