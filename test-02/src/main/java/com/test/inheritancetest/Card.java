package com.test.inheritancetest;

public class Card  {
   private String cardNumber;
    private String cardName;

   private String exipryDate;

   private String cvvNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getExipryDate() {
        return exipryDate;
    }

    public void setExipryDate(String exipryDate) {
        this.exipryDate = exipryDate;
    }

    public String getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(String cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    public double getBlanaceInfo(){
        return 10000.0;
    }




}
