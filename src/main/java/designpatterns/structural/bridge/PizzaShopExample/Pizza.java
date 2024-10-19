package designpatterns.structural.bridge.PizzaShopExample;

public abstract class Pizza {

    // IMPLEMENTATION
    private String sauce;

    private String toppings;

    private String crust;

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public abstract void makePizza();
}