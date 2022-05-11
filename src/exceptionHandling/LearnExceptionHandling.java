package exceptionHandling;

import java.sql.Driver;
import java.util.Scanner;

public class LearnExceptionHandling {

    // Exception handling:
    // try catch block
    // try {  } catch(){      }


    public static void main(String[] args) {
        String message = "Welcome back after Eid Vacation";
        System.out.println(message.length());

        //  Thread.sleep(10000);

        System.out.println("Hello");


        try {
            int a = 34;
            int b = 0;
            int div = a / b;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Yahoo Arithmetic Exception : " + e.getMessage());
        }


        try {
            // try block: try to execute this block of code

            System.out.println(message.charAt(50));


        } catch (Exception exception) {
            // Throw a message inside catch block, so that you know the issue
            System.out.println("String index out of bounds exception : "+exception.getMessage());
            System.out.println("String index out of bounds exception : "+ exception);
           // exception.printStackTrace();
        }


        // Class not found exception

//        try{
//          //  DemoMobile demoMobile= new DemoMobile();
//          //  Class.forName(Driver.class);
//            System.out.println("");
//        } catch (ClassNotFoundException e){
//            System.out.println("Class not found exception");
//        }



//
//        try {
//            Scanner input=new Scanner(System.in);
//            System.out.println("Enter  your Age");
//            int age=input.nextInt();
//            System.out.println(age);
//        } catch (Exception e){
//            System.out.println(e);
//        }


        // null point exception
//        try {
//            String name=null;
//            System.out.println(name.length());
//        } catch (Exception e){
//            System.out.println("Null point exception "+e);
//           // NullPointerException
//
//                    // compile : byte
//                    // jvm byte
//                    //
//        }



//            String age="34";
//     //   Integer.parseInt(age);
//        Integer.valueOf(age);
//        System.out.println( "using value of "+Integer.valueOf(age));
//        int a=Integer.parseInt(age);
//        int b=44;
//        int c= a+b;
//        System.out.println(c);
//    //  System.out.println(Integer.parseInt(age));
//
        String number=" 777 ";
        int newNumber= Integer.valueOf(number.trim());
//
//
//       try {
//           System.out.println(newNumber);
//           int myInt= Integer.valueOf(" 456 ");
//
//           System.out.println(myInt);
//       } catch (Exception e){
//           System.out.println("Number format exception "+e);
//       }


       // Throws
        System.out.println(newNumber);
      //  int myInt= Integer.valueOf(" 888 ");
     //   System.out.println(myInt);
       // throw new NumberFormatException();

//        int age1=0;
//        if (age1==0){
//            System.out.println("Demo");
//            throw new NumberFormatException("This is Number format Exception ===>");
//        }



      //  throw new NumberFormatException("This is Number format Exception");


        System.out.println("**************************************");
       LearnExceptionHandling learn=new LearnExceptionHandling();
       // learn.doDiv();
        learn.doDiv1();

    }

     Exception e;

    public  void doDiv() throws ArithmeticException{
     try {
           int a=50;
           int b=0;
           int c=a/b;
           System.out.println(c);
       } catch (Exception e){
           System.out.println("Arithmetic Exception ===>");
       } finally {
         // finally block much have to execute
         System.out.println("Hello tajwar");



     }
    //    System.out.println("DDD"+this.e.getMessage());
     //   throw  new ArithmeticException("This is Arithmetic Exception :::::::::::::::");
    }


    public  void doDiv1() throws ArithmeticException{
        try {
            int a=50;
            int b=0;
            System.out.println("Adnan is tying to understand java");
            int c=a/b;
            System.out.println(c);
        } catch (Exception e){
            System.out.println("Arithmetic Exception ===> + ===>");

            int f=30;
            int g=66;
            int h=f+g;
            System.out.println(h);

            try {
                String name="James";
                System.out.println(name.charAt(20));

            } catch (Exception e1){
                System.out.println("Index out of bounds exception");

                try {

                } catch (Exception e3){

                }

            }

        } finally {
            System.out.println("Hello Adnan");

            try {

            }catch (Exception e4){


            } finally {



            }

        }

    }




}
