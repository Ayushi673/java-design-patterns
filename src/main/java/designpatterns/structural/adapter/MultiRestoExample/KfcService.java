package designpatterns.structural.adapter.MultiRestoExample;

import designpatterns.structural.adapter.MultiRestoExample.model.JsonData;

public class KfcService {
    public void showMenu(JsonData jsonData) {
        System.out.println("KFC Item : " + jsonData.getFoodItem() + ", Price : " + jsonData.getCost());
    }

    public void showRecommendations(JsonData jsonData) {
        System.out.println("Recommendation - KFC Item : " + jsonData.getFoodItem());
    }
}
