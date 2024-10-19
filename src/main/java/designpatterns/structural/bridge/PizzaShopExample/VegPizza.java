package designpatterns.structural.bridge.PizzaShopExample;

public class VegPizza extends Pizza {
    // CONCRETE IMPLEMENTATION
    @Override
    public void makePizza() {
        System.out.println("Making VegPizza using "+getSauce()+", "+getToppings()+", "+getCrust());
    }
}
