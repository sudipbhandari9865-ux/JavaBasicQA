package oopconcept.abstraction;

public class VehicleStart {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        Truck truck1 = new Truck();

        bike1.start();
        truck1.start();
    }
}
