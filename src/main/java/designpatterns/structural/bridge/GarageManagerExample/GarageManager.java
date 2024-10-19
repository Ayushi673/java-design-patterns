package designpatterns.structural.bridge.GarageManagerExample;

public class GarageManager {
    //CLIENT CODE
    public static void main(String[] args) {
        Workshop workshop = new DeepClean(new Car("blue", "Honda", 2));
        workshop.servicingWork();
        Workshop workshop1 = new Refurbish(new Truck("Black", "Volvo", 11));
        workshop1.servicingWork();
        Workshop workshop2 = new Refurbish(new Truck("Black", "Volvo", 5));
        workshop2.servicingWork();

        // ABSTRACTION = Workshop
        // REFINED ABSTRACTION = DeepClean, Refurbish
        // IMPLEMENTATION = Vehicle
        // CONCRETE IMPLEMENTATIONS = Car, Truck
    }
}
