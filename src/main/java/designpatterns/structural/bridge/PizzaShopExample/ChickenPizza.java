package designpatterns.structural.bridge.PizzaShopExample;

public class ChickenPizza extends Pizza {

    // CONCRETE IMPLEMENTATION
    @Override
    public void makePizza() {
        System.out.println("Making Chicken Pizza using "+getSauce()+", "+getToppings()+", "+getCrust());
    }
}
