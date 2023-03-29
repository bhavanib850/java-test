package com.test.inheritancetest;

public class VisaCard extends Card {

   private String benefits;

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public void limitChange(){
        System.out.println(" visa card limit change");

    }
}
