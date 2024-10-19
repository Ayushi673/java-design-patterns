package designpatterns.structural.bridge.PizzaShopExample;

public class ItalianResto extends Restaurant {
    public ItalianResto(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void setSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    public void setToppings() {
        pizza.setToppings("No toppings");
    }

    @Override
    public void setCrust() {
        pizza.setCrust("Thin crust");
    }
}
