package oop.inheritance;

import oop.abstraction.Mobile;

public class Father extends GrandFather {


    // variable
    public String fFavouriteColor = "Blue";
    public String fFavouriteFood = "Beef";
    public String fFavouriteSports = "Soccer";

    private String fSSN = "63534534534";
    private String fBankAccountNumber = "87567567567";

    // Method
    public void fTrustWorthy() {
        System.out.println("Father is TrustWorthy");
    }

    public void fLoveToPlay() {
        System.out.println("Father love to play soccer");
    }

    public void fHeight() {
        System.out.println("Father height was 5.9");
    }

    public void fWeight() {
        System.out.println("Father weight was 180lbs");
    }

    // constructor

    public Father(String fFavouriteColor) {
        this.fFavouriteColor = fFavouriteColor;
    }

    public Father() {
        // Calling constructor
        super(); // super class/  call the parent class constructor
        System.out.println("yahoo");
    }


    public void getInfoFromParent() {
        // calling variable
        System.out.println(super.gfFavouriteColor);
        // calling method
        System.out.println(super.getGfSSN());
    }

    public String getfSSN() {
        return fSSN;
    }

    public void setfSSN(String fSSN) {
        this.fSSN = fSSN;
    }

    public String getfBankAccountNumber() {
        return fBankAccountNumber;
    }

    public void setfBankAccountNumber(String fBankAccountNumber) {
        this.fBankAccountNumber = fBankAccountNumber;
    }

    public String getfFavouriteColor() {
        return fFavouriteColor;
    }

    public void setfFavouriteColor(String fFavouriteColor) {
        this.fFavouriteColor = fFavouriteColor;
    }

    public String getfFavouriteFood() {
        return fFavouriteFood;
    }

    public void setfFavouriteFood(String fFavouriteFood) {
        this.fFavouriteFood = fFavouriteFood;
    }

    public String getfFavouriteSports() {
        return fFavouriteSports;
    }

    public void setfFavouriteSports(String fFavouriteSports) {
        this.fFavouriteSports = fFavouriteSports;
    }



}
