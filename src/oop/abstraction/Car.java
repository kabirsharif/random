package oop.abstraction;

public interface Car {

    // Interface is a guideline for future / roadmap for future / further development
    // Interface is 100% Abstract


   // String name; // can not instantiate
    String name = null;
    String seat="2";
    int headLight=4;
    boolean isGasTankAvailable=true;
    double price = 0;


    // Declare method with body
//    public void display(){
//        System.out.println("This is Display method");
//    }

    // Declare method without body
   public void display();
    public void carStart();
    public void carStop();
    public void carWheel();
    public void carEngine();
    public void carSteering();
    public void carAcceleration(String info, int price);

//    public static void main(String[] args) {
//        System.out.println("hello");
//
//        Car myCar=new Car();
//    }

  //  Car myCar=new Car();


 public interface DemoCar{

  public void demoCarInfo();

 }



}
