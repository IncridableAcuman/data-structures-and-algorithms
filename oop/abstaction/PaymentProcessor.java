package oop.abstaction;

import oop.encapsulation.User;

public abstract class PaymentProcessor {
    public abstract void pay(User user,double amount);
}
