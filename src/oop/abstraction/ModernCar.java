package oop.abstraction;

public abstract class ModernCar {

    // Abstract class : is not fully abstract

    // Variable same as Regular class
    String modernCarName;
    double modernCarPrice=80000.500;


    // Regular method/ non-abstract method
    public void autoDrive(){
        System.out.println("Modern Car has Auto Driving feature");
    }


    // Abstract method
    public abstract void gps();
    public abstract void camera360View();
    public abstract void sunRoof();
    public abstract void autoStop();
    public abstract void parkingSensor();


//    public static void main(String[] args) {
//        ModernCar modernCar=new ModernCar();
//    }


}
