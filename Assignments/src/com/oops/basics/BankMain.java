package com.oops.basics;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank(10000);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("------------------------------------------------------------Welcome to Banking----------------------------------------------------");
        System.out.println("**********************************************************************************************************************************");
        System.out.println("Select 1 for Deposit  :");
        System.out.println("Select 2 for Withdraw :");
        System.out.println("Select 3 for Exit     :");
        double amount;
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the amount to be Deposit : ");
                amount = scanner.nextInt();
                bank.deposit(amount);
                System.out.println(amount+ " Deposited to Your Account");
                System.out.println("Thank you for Using Banking Service");
                break;


            case 2:
                System.out.println("Enter the amount to be Withdraw : ");
                amount = scanner.nextInt();
                bank.withdraw(amount);
                System.out.println(amount+ " Withdrawl from Your Account");
                System.out.println("Thank you for Using Banking Service");
                break;

            case 3:
                break;

            default:
                System.out.println("You are Selected Wrong Details");
        }
    }
}
