package designpatterns.structural.adapter.MultiRestoExample.model;


public class JsonData {
    private String foodItem;
    private Integer cost;

    public JsonData(String foodItem, Integer cost) {
        this.foodItem = foodItem;
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }
}
