package designpatterns.structural.adapter.MultiRestoExample;

import designpatterns.structural.adapter.MultiRestoExample.model.XmlData;

public class MultiRestoApp implements IMultiRestoApp {

    @Override
    public void displayMenu(XmlData xmlData) {
        System.out.println("In-House Item : " + xmlData.getItem() + ", Price : " + xmlData.getPrice());
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Item : " + xmlData.getItem());
    }

    public static void main(String []args) {

        // CLIENT

        IMultiRestoApp clientApp = new MultiRestoApp();
        clientApp.displayMenu(new XmlData("Chicken wings", 350.12));
        KfcServiceAdapter adapter = new KfcServiceAdapter();
        adapter.displayMenu(new XmlData("Chicken tenders", 350.12));
    }
}
