package oopconcept.inheritance;

public class SportCar extends Car {
    private int topSpeed;

    public SportCar(String model, String brand, int year, int topSpeed){
        super(model,brand,year);
        this.topSpeed = topSpeed;

    }
    public void displayTopSpeed(){
        System.out.println("the topSpeed if the car is: "+topSpeed);
    }
    public static void main(String[] args) {
        SportCar car1 = new SportCar("dolphin", "BYD", 2026, 100);
        car1.displayTopSpeed();
        System.out.println(car1.displayCarInformation());
    }

}
