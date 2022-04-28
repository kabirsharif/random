package controlflow;

public class LearnNestedForLoop {

    // user will give input and make a right triangle

    // output
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *


    public static void main(String[] args) {

        rightTriangle(10);
        reverseTriangle(10);


    }


    public static void rightTriangle(int rowNum) {
        for (int i = 1; i <= rowNum; i++) {
            // parent for loop
            for (int j = 1; j <= i; j++) {
                // child/ nested for loop
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }


    }


    public static void reverseTriangle(int rowNum){
        for (int i =rowNum; i>=1;i--){
            for (int k=i;k>=1; k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


    }




}
