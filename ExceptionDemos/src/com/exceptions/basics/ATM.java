package com.exceptions.basics;

public class ATM {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.withdraw((2000));
        }catch (Exception e){
            System.out.println("Error...");
        }
    }
}
