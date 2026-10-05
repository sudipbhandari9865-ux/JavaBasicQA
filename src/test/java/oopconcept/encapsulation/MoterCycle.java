package oopconcept.encapsulation;

public class MoterCycle {
    private String brand;
    private String model;
    private int year;

    public MoterCycle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String MoterCycleInformation() {
        return "The brand of the Motercycle is " + brand + ",the model is " + model + " and the made in year is " + year;

    }

    public static void main(String[] args) {
//        MoterCycle moterCycle1 = new MoterCycle("Bazaj", "pulser", 2022);
//        System.out.println(moterCycle1.MoterCycleInformation());
     MoterCycle bike = new MoterCycle("Honda", "CBR", 2024);
     bike.setBrand("Homda");
     bike.setModel("CBR");
     bike.setYear(2022);

        System.out.println(bike.MoterCycleInformation());
        System.out.println(bike.getBrand());
        System.out.println(bike.getModel());
        System.out.println(bike.getYear());

    }
}
