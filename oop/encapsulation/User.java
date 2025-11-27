package oop.encapsulation;

public class User {
    private final String username;
    private double balance;

    public User(String username,double balance){
        this.username=username;
        this.balance=balance;
    }
    public String getUsername(){
        return username;
    }
    public double getBalance(){
        return balance;
    }

    public void deductBalance(double amount){
        if (amount<=balance){
            balance-=amount;
        } else {
            System.out.println("Not enough balance");
        }
    }
}
