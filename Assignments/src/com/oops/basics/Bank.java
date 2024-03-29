package com.oops.basics;

public class Bank {
    double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount){
        double totalBalance = balance- amount;
        System.out.println(totalBalance);
    }
    void deposit(double amount){
        double totalBalance =balance+ amount;
        System.out.println(totalBalance);
    }
    double getBalance()
    {
        return balance;
    }
}
