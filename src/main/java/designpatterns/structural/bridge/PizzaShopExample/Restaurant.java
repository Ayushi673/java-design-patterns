package designpatterns.structural.bridge.PizzaShopExample;

public abstract class Restaurant {

    // ABSTRACTION
    public Pizza pizza;
    // here we encapsulate an IMPLEMENTATION class inside an ABSTRACTION i.e, interface or abstract class.

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void setSauce();
    public abstract void setToppings();
    public abstract void setCrust();

    public void deliver() {
        setCrust();
        setSauce();
        setToppings();
        pizza.makePizza();
        System.out.println("Pizza delivery in process");
    }

}
