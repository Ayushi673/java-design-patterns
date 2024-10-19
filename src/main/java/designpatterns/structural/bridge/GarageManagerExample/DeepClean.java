package designpatterns.structural.bridge.GarageManagerExample;

public class DeepClean extends Workshop {

    public DeepClean(Vehicle vehicle) {
        super(vehicle);
    }
    @Override
    void servicingWork() {
        System.out.print("Deep clean cost for "+ vehicle.vehicleSpecifications() + " is :");
        System.out.println(vehicle.vehicleCharges() + 350);
    }
}
