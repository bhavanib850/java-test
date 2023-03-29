package com.test.inheritancetest;

public class MasterCard extends Card {
   private String benefits;
    private double balance;

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

    public void limitChange(){
        System.out.println(" master card limit change");

    }
}
