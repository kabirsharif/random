package oop.polymorphism.methodOverloading;

public class Calculator {

    // Method Over Loading
    // Compile time
    // Method name should be same
    // Pattern/ signature type is making difference


    public static int doSum(int num1, int num2) {
        int total = num1 + num2;
        System.out.println("Total " + total);
        return total;
    }

    public static int doSum(int num1, int num2, int num3) {
        int total = num1 + num2+num3;
        System.out.println("Total " + total);
        return total;
    }

    public static int doSum(int num1, int num2, int num3, int num4) {
        int total = num1 + num2+num3+num4;
        System.out.println("Total " + total);
        return total;
    }


    public static void studentInfo( String firstName, String lastName){
        System.out.println("Student First Name : "+firstName+" Last Name "+lastName);
    }

    public static void studentInfo( String firstName, String lastName, String address){
        System.out.println("Student First Name : "+firstName+" Last Name "+lastName +" Address : "+address);
    }

    public static void studentInfo( String firstName, String lastName, String address, int age){
        System.out.println("Student First Name : "+firstName+" Last Name "+lastName +" Address : "+address +" Age : "+age);
    }



    public static void main(String[] args) {
     doSum(22,33);
     doSum(44,55,66);
     doSum(144,155,166,177);


        studentInfo("Tajwar","Hamid");
        studentInfo("Nadia","Eti","Queens,NY");
        studentInfo("Rajib","Deb","Jamaica,NY",25);




    }

















}
