package designpatterns.structural.bridge.GarageManagerExample;

public class Truck extends Vehicle {

    public Truck(String color, String brand, Integer age) {
        setBrand(brand);
        setVehicleColor(color);
        setAge(age);
    }
    @Override
    public String vehicleSpecifications() {
        return isOldOrNew() +" "+ getVehicleColor() +" "+ getBrand() + " Truck";
    }

    @Override
    public Integer vehicleCharges() {
        return getAge() > 10 ? 1000 : 500;
    }

    private String isOldOrNew() {
        return getAge() > 10 ? "Old" : "New";
    }
}
