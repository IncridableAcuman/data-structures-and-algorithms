package oop.inheritance;

import oop.abstaction.PaymentProcessor;
import oop.encapsulation.User;

public class PaypalPayment extends PaymentProcessor {
    @Override
    public void pay(User user, double amount){
        System.out.println("Payment is being made by PayPal");
        user.deductBalance(amount);
        System.out.println("Payment completed");
    }
}
