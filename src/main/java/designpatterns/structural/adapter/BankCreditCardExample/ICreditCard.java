package designpatterns.structural.adapter.BankCreditCardExample;

public interface ICreditCard {
    void giveBankDetails();
    String getCreditCardInfo(boolean isApproved);
}
