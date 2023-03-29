package com.test.inheritancetest;

public class Test {
    public static void main(String[] args) {

        MasterCard masterCard=new MasterCard();
        masterCard.setCardName("master card");
        masterCard.setBalance(1000.0);
        masterCard.setCardNumber("12343644");
        masterCard.setBenefits("master card benefits");
        masterCard.setCvvNumber("123");
        masterCard.setExipryDate("2024-09-24");
        double balance=masterCard.getBlanceInfo();
        System.out.println(balance);
        masterCard.limitChange();

        System.out.println("=============================================");

        VisaCard visaCard=new VisaCard();
        visaCard.setCardName("master card");
        visaCard.setBalance(1000.0);
        visaCard.setCardNumber("12343644");
        visaCard.setBenefits("master card benefits");
        visaCard.setCvvNumber("123");
        visaCard.setExipryDate("2024-09-24");
        visaCard.limitChange();
        double balanace1=visaCard.getBlanceInfo();
        System.out.println(balanace1);
    }

}
