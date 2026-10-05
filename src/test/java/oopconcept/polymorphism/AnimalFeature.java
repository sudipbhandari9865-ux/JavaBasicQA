package oopconcept.polymorphism;

public class AnimalFeature {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.speak();
        dog.speak();
        cat.speak();

    }
}
