package designpatterns.structural.adapter.BankCreditCardExample;

import designpatterns.structural.adapter.BankCreditCardExample.model.BankDetails;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAdapter extends BankDetails implements ICreditCard {

    @Override
    public void giveBankDetails() {
        //Enter BankDetails
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name: ");
            setAccountHolderName(sc.nextLine());
            System.out.println("Enter bank name: ");
            setBankName(sc.nextLine());
            System.out.println("Enter account number: ");
            setAccountNumber(sc.nextLong());
        } catch (Exception e) {
            e.printStackTrace();
            throw new InputMismatchException("Invalid input!");
        }
    }

    @Override
    public String getCreditCardInfo(boolean isApproved) {
        if (getBankName() == null || getAccountNumber() == 0 || getAccountHolderName() == null) {
            return "Please giveBankDetails - customer info is empty!";
        }
        String status = "Account Number : " + getAccountNumber() + " of Customer : " + getAccountHolderName();
        if (isApproved) {
           status = status + " IS ELIGIBLE for getting pre-approved credit card";
        } else {
           status = status + " IS NOT ELIGIBLE for getting pre-approved credit card";
        }
        return status;
    }

    // Also an example of coupling between two methods - which is a bad practice. We must minimise coupling.
}