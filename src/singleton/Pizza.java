package singleton;

public class Pizza {

    String pizzaName;
    double pizzaPrice;

    // Default private constructor
    private Pizza() {

    }


    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;

    }

    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;

    }


    // Create a private static Object  : private static className objName=new constructorOfClass();
    private static Pizza instance  =new Pizza();

    // Create a public return type of method
    public static Pizza getInstance(){
        return instance;  // return private object
    }









}
