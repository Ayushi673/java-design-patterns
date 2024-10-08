package designpatterns.structural.adapter.MultiRestoExample.model;

public class XmlData {

    private String item;
    private Double price;

    public XmlData(String item, Double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
