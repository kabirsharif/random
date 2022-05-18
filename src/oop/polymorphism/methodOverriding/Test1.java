package oop.polymorphism.methodOverriding;

import java.io.OutputStream;
import java.io.PrintStream;

public class Test1  extends PrintStream {


    public Test1(OutputStream out) {
        super(out);
    }

    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.eating();
        cat.catInfo();

        System.out.println("**********************************");


        Animal animal=new Cat();
        animal.eating();

        System.out.println("**********************************");

        Tiger tiger=new Tiger();
        tiger.catInfo();
        tiger.run();
        tiger.sleep();
        tiger.animalDetails();
        tiger.catGroupColor();
        tiger.catGroupPrice();
        tiger.catGroupSize();

        System.out.println("**********************************");
        Cat myCat=new Tiger();
        myCat.catInfo();

        System.out.println("**********************************");
       // Tiger myTiger = new Cat();
       // Tiger myTiger = (Tiger) new Cat();
      //  myTiger.catInfo();


        System.out.println("**********===********************");



        Test1 test1=new Test1(System.out);

        test1.println();

    }

    // Override method from JDK System.out.println()  PrintStream class
    @Override
    public void println() {
        System.out.println("We are learning method overriding");
    }


}
