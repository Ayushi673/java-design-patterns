package designpatterns.structural.bridge.GarageManagerExample;

public class Car extends Vehicle {

    public Car(String color, String brand, Integer age) {
        setBrand(brand);
        setVehicleColor(color);
        setAge(age);
    }
    @Override
    public String vehicleSpecifications() {
        return isOldOrNew() +" "+ getVehicleColor() +" "+ getBrand() + " Car";
    }

    @Override
    public Integer vehicleCharges() {
        return getAge() > 4 ? 400 : 200;
    }

    private String isOldOrNew() {
        return getAge() > 4 ? "Old" : "New";
    }
}
