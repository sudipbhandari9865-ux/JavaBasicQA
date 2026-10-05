package oopconcept.inheritance;

public class Car {
    protected String model;
    protected String brand;
    protected int year;

    public Car(String model,String brand, int year){
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String displayCarInformation(){
        return "The brand of the car is "+brand+",the model is "+model+" and the made in year is "+year;
    }

}

