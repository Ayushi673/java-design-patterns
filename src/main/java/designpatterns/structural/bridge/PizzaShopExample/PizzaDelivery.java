package designpatterns.structural.bridge.PizzaShopExample;

public class PizzaDelivery {
    public static void main(String[] args) {

        //Client Code
        AmericanResto americanResto = new AmericanResto(new ChickenPizza());
        americanResto.deliver();

        AmericanResto americanResto1 = new AmericanResto(new VegPizza());
        americanResto1.deliver();

        ItalianResto italianResto = new ItalianResto(new ChickenPizza());
        italianResto.deliver();

        //Bridge Design Pattern - separates abstraction from functional implementation.

        //Here, ABSTRACTION refers to high level control layer that delegates work to implementation layer.


        //Restaurant is the FUNCTIONAL ABSTRACTION - Italian and AmericanResto are refined abstractions.
        //Pizza is the IMPLEMENTATION (ChickenPizza and VegPizza are concrete implementations)
    }
}
