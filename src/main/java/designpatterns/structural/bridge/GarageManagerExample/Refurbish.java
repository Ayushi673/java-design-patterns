package designpatterns.structural.bridge.GarageManagerExample;

public class Refurbish extends Workshop {
    public Refurbish(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    void servicingWork() {
        System.out.print("Repair parts cost for "+ vehicle.vehicleSpecifications() + " is :");
        System.out.println(vehicle.vehicleCharges() + 850);
    }
}

