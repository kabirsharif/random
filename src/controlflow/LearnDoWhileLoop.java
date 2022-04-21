package controlflow;

public class LearnDoWhileLoop {

    //Do While Loop

    // Do while Loop execute at least one time first then it will check condition


    // do { code and iterator     } while();


    public static void main(String[] args) {
        // First it will execute one time then it will check the condition
        // if condition is true then execute block of the loop

        int age = 22;
//        do {
//            // Execute this block of code
//            System.out.println("Hello");
//
//        age--; // To control loop
//        } while ( age>18   );


//        do {
//            // Execute this block of code
//            System.out.println("Hello");
//
//            age--; // To control loop
//        } while ( age>32   );


        System.out.println("*************************************");

        //  LearnDoWhileLoop.wishOnBirthday(43,"Ahmed");

        System.out.println("*************************************");
        boolean cakeIsAvailable = true;
        do {
            LearnDoWhileLoop.wishOnBirthday(43, "Ahmed");
        } while (cakeIsAvailable = false);
        System.out.println("************* String cake name ************************");
        String cakeName = "chocolat mousse";
        do {
            LearnDoWhileLoop.wishOnBirthday(43, "Ahmed");
        } while (cakeName == "Vanilla");


    }


    public static void wishOnBirthday(int age, String name) {
        do {
            System.out.println("Happy birthday to " + name);
            age--;
        } while (age > 18);

    }


}
