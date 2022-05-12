package oop.abstraction;

public class TestGM {

    // Test class where we will call all the action method from concrete class


    public static void main(String[] args) {

        GeneralMotor gm = new GeneralMotor();
        gm.gmCarInfo();
        gm.carStart();
        gm.carEngine();
        gm.carWheel();
        gm.carAcceleration("GM2025T", 75000);
        gm.largeDisplay();
        gm.gps();
        gm.camera360View();
        gm.autoPilotAbsBreak();


        GeneralMotor gm1 = new GeneralMotor();
        gm1.carSteering();
        System.out.println(gm1.gmCarName);
        gm1.gmCarQuantity = 300;
        System.out.println(gm1.gmCarQuantity);


        System.out.println(gm.seat);

        gm1.boostEngine();
        gm1.flyingFeature();
        gm1.sensor();
        gm1.sunRoof();




        System.out.println("***********************************************");
        // Create object
        GeneralMotor gm2 = new GeneralMotor();

        // Interface car type do not have largeDisplay()
        Car myCar = new GeneralMotor();
        myCar.carStart();
       // myCar.largeDisplay();
        myCar.carStop();
        myCar.carSteering();
        // Casting the type
        ((GeneralMotor) myCar).largeDisplay();

        System.out.println("***********************************************");

        Tesla tesla =new Tesla();
        tesla.airBag();
        tesla.flyingFeature();
        tesla.autoPilot();
        tesla.flyingCarInformation(); // non-abstract method
        tesla.carStart();


        ElectricCar  ec   =   new Tesla();

        ec.electricCarFeature();
       // ec.boostEngine();







    }


}
