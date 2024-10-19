package designpatterns.structural.bridge.PizzaShopExample;

public class VegPizza extends Pizza {

    @Override
    public void makePizza() {
        System.out.println("Making VegPizza using "+getSauce()+", "+getToppings()+", "+getCrust());
    }
}
