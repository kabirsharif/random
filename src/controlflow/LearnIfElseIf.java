package controlflow;

import java.util.Scanner;

public class LearnIfElseIf {


    public static void main(String[] args) {
        // if else if

        LearnIfElseIf learn=new LearnIfElseIf();
       // learn.doRetirementCalculation();
        learn.getGrade();


    }

    public void doRetirementCalculation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age to get the Retirement Calculation");
        int age = input.nextInt();
        if (age >= 0 && age <= 40) {
            System.out.println("Your age is more/less than 24");
        } else if (age >= 40 && age <= 50) {
            System.out.println("Your age is more than 40");
        } else if (age >= 50 && age <= 65) {
            System.out.println("Your age is more/less than 60");
        }
    }


    public void getGrade(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Score to get the Grade");
        double score = input.nextDouble();

        if (score >=90) {
            System.out.println("You got A+");
        } else if (score >=80) {
            System.out.println("You got B+");
        } else if (score >=70) {
            System.out.println("You got B");
        }else if (score >=60) {
            System.out.println("You got C");
        } else if (score >=50) {
            System.out.println("You got D");
        } else {
            System.out.println("You are fail");
        }

    }







}
