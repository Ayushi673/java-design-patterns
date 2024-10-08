package designpatterns.structural.adapter.MultiRestoExample;

import designpatterns.structural.adapter.MultiRestoExample.model.JsonData;
import designpatterns.structural.adapter.MultiRestoExample.model.XmlData;

public class KfcServiceAdapter implements IMultiRestoApp {

    //ADAPTER CLASS
    private KfcService kfcService;

    public KfcServiceAdapter() {
        kfcService = new KfcService();
    }

    @Override
    public void displayMenu(XmlData xmlData) {
        JsonData jsonData = convertXmlToJsonData(xmlData);
        kfcService.showMenu(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJsonData(xmlData);
        kfcService.showRecommendations(jsonData);
    }

    private JsonData convertXmlToJsonData(XmlData xmlData) {
        return new JsonData(xmlData.getItem(), xmlData.getPrice().intValue());
    }
}
