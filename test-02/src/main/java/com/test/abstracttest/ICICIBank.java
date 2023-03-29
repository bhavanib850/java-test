package com.test.abstracttest;

public class ICICIBank extends RBI{
    @Override
    double getPersonalInterestRate() {
        return 11.5;
    }

    @Override
    double getHomeInterestRate() {
        return 8.9;
    }
}
