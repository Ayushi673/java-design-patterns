package designpatterns.structural.adapter.MultiRestoExample;

import designpatterns.structural.adapter.MultiRestoExample.model.XmlData;

public interface IMultiRestoApp {

    void displayMenu(XmlData xmlData);
    void displayRecommendations(XmlData xmlData);
}
