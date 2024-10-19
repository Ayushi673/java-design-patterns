package designpatterns.structural.bridge.GarageManagerExample;

public abstract class Vehicle {

    private String vehicleColor;

    private Integer age;

    private String brand;

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public abstract String vehicleSpecifications();
    public abstract Integer vehicleCharges();
}
