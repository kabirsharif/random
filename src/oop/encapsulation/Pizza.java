package oop.encapsulation;

public class Pizza {

    // Encapsulation


    private String pizzaName;
    private double pizzaPrice;
    private String pizzaTopping;

    public char pizzaSize;
    private boolean isPizzaAvailable;

    public Pizza() {

    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(String pizzaName, double pizzaPrice) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
    }

    public Pizza(String pizzaName, double pizzaPrice, String pizzaTopping) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaTopping = pizzaTopping;
    }


    public Pizza(String pizzaName, double pizzaPrice, String pizzaTopping, char pizzaSize) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaTopping = pizzaTopping;
        this.pizzaSize = pizzaSize;
    }

    public Pizza(String pizzaName, double pizzaPrice, String pizzaTopping, char pizzaSize, boolean isPizzaAvailable) {
        this.pizzaName = pizzaName;
        this.pizzaPrice = pizzaPrice;
        this.pizzaTopping = pizzaTopping;
        this.pizzaSize = pizzaSize;
        this.isPizzaAvailable = isPizzaAvailable;
    }


    // Getter and Setter : To Access the private property from another class
    // Getter() and Setter()


    // Getter: Retrive the value : To Get the value : Return Type of Method
    public String getPizzaName() {
        return pizzaName;
    }


    // Setter : set the value / assign value : Void type method
    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }


    public String getPizzaTopping() {
        return pizzaTopping;
    }

    public void setPizzaTopping(String pizzaTopping) {
        this.pizzaTopping = pizzaTopping;
    }


    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }
}
