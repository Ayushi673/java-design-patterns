package designpatterns.structural.adapter.MultiRestoExample;

import designpatterns.structural.adapter.MultiRestoExample.model.JsonData;

public class KfcService {

    /*
    ADAPTEE CLASS - generally 3rd party or legacy classes which cannot be directly
    used by client due to incompatible interfaces */
    public void showMenu(JsonData jsonData) {
        System.out.println("KFC Item : " + jsonData.getFoodItem() + ", Price : " + jsonData.getCost());
    }

    public void showRecommendations(JsonData jsonData) {
        System.out.println("Recommendation - KFC Item : " + jsonData.getFoodItem());
    }
}
