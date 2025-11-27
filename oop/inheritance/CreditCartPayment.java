package oop.inheritance;

import oop.abstaction.PaymentProcessor;
import oop.encapsulation.User;

public class CreditCartPayment extends PaymentProcessor {

    @Override
    public void pay(User user,double amount){
        System.out.println("Payment is being made by credit cart");
        user.deductBalance(amount);
        System.out.println("Payment completed");
    }
}
