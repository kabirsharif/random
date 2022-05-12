package oop.encapsulation;

public class TestPizza {


    public static void main(String[] args) {
        Pizza myPizza=new Pizza();
        myPizza.pizzaSize='L';
        System.out.println(myPizza.pizzaSize);

      //  myPizza.pizzaPrice

        myPizza.setPizzaName("Cheese Pizza"); // Assigning value

        System.out.println(myPizza.getPizzaName());


        myPizza.setPizzaTopping("Hot Sauce");
        System.out.println(myPizza.getPizzaTopping());


    }
}
