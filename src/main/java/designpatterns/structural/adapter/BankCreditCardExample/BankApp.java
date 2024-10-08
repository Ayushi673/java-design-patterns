package designpatterns.structural.adapter.BankCreditCardExample;

public class BankApp {
    public static void main(String []args) {
        ICreditCard creditCard = new BankAdapter();
        creditCard.giveBankDetails();
        System.out.println(creditCard.getCreditCardInfo(false));
    }
}
