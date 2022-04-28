package string;

public class LearnString {

    // String : is a class and Data type

    // String is a sequence of character
    public static void main(String[] args) {
        String birthdayWish = "Happy Birthday to Ahmed";

        System.out.println("Length value : " + birthdayWish.length());
        System.out.println("Lower case : " + birthdayWish.toLowerCase());
        System.out.println("Upper case : " + birthdayWish.toUpperCase());
        System.out.println("Char at : " + birthdayWish.charAt(10));
        // index start from zero 0
        System.out.println("Sub String : " + birthdayWish.substring(7));
        System.out.println("Sub String : " + birthdayWish.substring(6, 14));
        System.out.println("Compare : " + birthdayWish.equals("Happy Birthday to Ahmed"));
        System.out.println("Compare Ignore case: " + birthdayWish.equalsIgnoreCase("Happy Birthday to ahmed"));
        System.out.println("Concatenation : " + birthdayWish.concat("Yelles"));
        System.out.println("Concatenation : " + "SID-".concat("124"));


        System.out.println("**************Split, contain and to string method ***********************************");
        String stID = "102:ahmed";
        int age = 24;
        String stId1 = "boo:and:foo";
        System.out.println(stID.toString());
       // System.out.println(age.toString());
        System.out.println(stID.contains("bh"));
        System.out.println(stID.contains(":"));
        System.out.println(stID.split(":"));

        String str="Student@Wasee@Ahmed@Fouzia@Abu";
        String str1="Celia";
        String str2="StudentWaseeAhmedFouzia";
        String [] demoArray=str.split("@");
        String [] demoArray1=str.split("@",5);

        // For each loop
//        for (String a:demoArray){
//            System.out.println(a);
//        }

//        for (String a:demoArray1){
//            System.out.println(a);
//        }

        for (int i=0; i<demoArray.length; i++){
            System.out.println(demoArray[i]);
        }

        System.out.println("******************Exception Handling ********************");

        // Exception Handling
        // try catch block
        // try {} catch(){}
        String fName="James";

        try {
            System.out.println(fName);
         //   System.out.println("Char at : " + birthdayWish.charAt(16));
            System.out.println("Char at : " + birthdayWish.charAt(36));

        } catch (Exception  e  ){
           // e.printStackTrace();
            System.out.println("String Index out of bound exception");
        }





    }


}
