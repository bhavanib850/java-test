package com.test.abstracttest;

public class HDFCBank  extends RBI{
    @Override

    double getPersonalInterestRate() { return 12.5; }

    @Override
    double getHomeInterestRate() { return 7.9; }

}
