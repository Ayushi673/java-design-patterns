package designpatterns.structural.bridge.PizzaShopExample;

public class AmericanResto extends Restaurant {

    public AmericanResto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void setSauce() {
        pizza.setSauce( "Tomato");
    }

    @Override
    public void setToppings() {
        pizza.setToppings("Onion");
    }

    @Override
    public void setCrust() {
        pizza.setCrust("Thick crust");
    }
}
