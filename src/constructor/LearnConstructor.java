package constructor;

import basic.Mobile;

public class LearnConstructor {

    // Constructor:

    // Constructor name should be same as class name
    // Constructor has no return type
    // Constructor is used to initialize object


    // How to create constructor???
    // AccessModifier className/ConstructorName () {   }


    String name = "james";
    int age;
    String address;


    // Default constructor: Without any parameter
    public LearnConstructor() {
        System.out.println("hello");
        System.out.println("hello1");
        System.out.println("hello2");
        System.out.println("hello3");
    }

    // Single parameterize Constructor
    public LearnConstructor(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    // Multi Parameterize constructor

    public LearnConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student name is " + this.name + " " + "Age is " + this.age);
    }

    public LearnConstructor(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Student name is " + this.name + " " + "Age is " + this.age + " Address is " + this.address);
    }


    public static void main(String[] args) {

        // How to create an object?
        // className  objectName = new constructorOfClass();

        LearnConstructor obj = new LearnConstructor(); // call Default constructor

        Mobile mob = new Mobile();

        int age = 45;

        System.out.println(obj.name);

        System.out.println("========================================================");

        LearnConstructor wasee = new LearnConstructor("Ahmed");  // Argument passing inside the constructor
        LearnConstructor nadia = new LearnConstructor("Irin");  // Argument passing inside the constructor

        LearnConstructor tajwar = new LearnConstructor("naina", 23);
        LearnConstructor jamal = new LearnConstructor("Shebley", 34, "FL,USA");


    }


}
