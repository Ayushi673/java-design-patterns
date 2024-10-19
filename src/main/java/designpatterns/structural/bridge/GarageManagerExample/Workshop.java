package designpatterns.structural.bridge.GarageManagerExample;

public abstract class Workshop {

    public Vehicle vehicle;

    public Workshop (Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    abstract void servicingWork();
}
