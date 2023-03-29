package com.test.abstracttest;

public class Test {
    public static void main(String[] args) {
        RBI icici=new ICICIBank();
        double homeIrate=icici.getHomeInterestRate();
        double PIrate=icici.getPersonalInterestRate();
        System.out.println(homeIrate);
        System.out.println(PIrate);
        icici.getAccountInfo();

        RBI hdfc=new HDFCBank();
        double homeHrate= hdfc.getHomeInterestRate();
        double pHrate= hdfc.getPersonalInterestRate();
        System.out.println(homeHrate);
        System.out.println(pHrate);
        hdfc.getAccountInfo();
        }
    }


