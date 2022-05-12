package recursion;

public class LearnRecursion {

    // Recursion : Re call the method by itself
    //It's a process which is calling a method itself continiously
    // must call itself
    // must change its state and move toward the base case


    public static void main(String[] args) {

        tvDisplay();

    }


    static int count=0;
    public static void tvDisplay(){

        count++;
        if (count<5) {
            System.out.println("This is Tv Display");


            tvDisplay(); // Recursion method call
        }

    }




}
