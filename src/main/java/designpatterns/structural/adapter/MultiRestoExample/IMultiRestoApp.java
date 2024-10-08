package designpatterns.structural.adapter.MultiRestoExample;

import designpatterns.structural.adapter.MultiRestoExample.model.XmlData;

public interface IMultiRestoApp {

    // TARGET INTERFACE - the desired interface that is used by the client

    void displayMenu(XmlData xmlData);
    void displayRecommendations(XmlData xmlData);
}
