package oop.polymorphism;

import oop.abstaction.PaymentProcessor;
import oop.encapsulation.User;

public class PaymentService {
    public void paymentProcess(PaymentProcessor processor, User user,double amount){
        processor.pay(user,amount);
    }
}
