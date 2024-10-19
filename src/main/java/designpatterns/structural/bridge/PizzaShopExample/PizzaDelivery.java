package designpatterns.structural.bridge.PizzaShopExample;

public class PizzaDelivery {
    public static void main(String[] args) {
        AmericanResto americanResto = new AmericanResto(new ChickenPizza());
        americanResto.deliver();

        AmericanResto americanResto1 = new AmericanResto(new VegPizza());
        americanResto1.deliver();

        ItalianResto italianResto = new ItalianResto(new ChickenPizza());
        italianResto.deliver();
    }
}
