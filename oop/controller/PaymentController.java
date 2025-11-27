package oop.controller;

import oop.abstaction.PaymentProcessor;
import oop.encapsulation.User;
import oop.inheritance.CreditCartPayment;
import oop.inheritance.PaypalPayment;
import oop.polymorphism.PaymentService;

import java.util.Scanner;

public class PaymentController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        double balance = scanner.nextDouble();
        User user = new User(username,balance);

        PaymentService service = new PaymentService();
        PaymentProcessor creditCart = new CreditCartPayment();
        PaymentProcessor paypal = new PaypalPayment();

        service.paymentProcess(creditCart,user,10);
        System.out.println("Remaining balance: "+user.getBalance());

        service.paymentProcess(paypal,user,30);
        System.out.println("Remaining balance: "+user.getBalance());

    }
}
