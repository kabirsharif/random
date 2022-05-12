package oop.inheritance;

public class Test {


    public static void main(String[] args) {

        Father myFather=new Father();

        myFather.gfHeight();
        myFather.gfSmoking();
        myFather.fTrustWorthy();
        myFather.fWeight();
        myFather.fLoveToPlay();

     //   System.out.println(myFather.gfFavouriteColor);


     //   System.out.println(myFather.mobileName);

        myFather.getInfoFromParent();

        myFather.setfSSN("779879879");
        System.out.println(myFather.getfSSN());

        myFather.setGfSSN("999999987");
        System.out.println(myFather.getGfSSN());


        Son tajwar=new Son();
        tajwar.gfWeight();
        tajwar.fHeight();
        tajwar.sonFavProgramingLanguage();


        System.out.println("****************************************");
        // Class type is allowing us to access in the property
        Father ahmed= new Son();
        ahmed.fTrustWorthy();
       // ahmed.sonTrustWorthy();
        ((Son) ahmed).sonTrustWorthy();



    }






}
