package com.exceptions.costom;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws NegativeBalanceException, OutOfLimitsException {
        try {
            if(balance-amount<=0)
                throw new NegativeBalanceException(("Balance is -ve"));
            if(amount>100)
                throw new OutOfLimitsException("Limit is More");

            balance=balance-amount;
            System.out.println("balance "+balance);
        }catch (NegativeBalanceException e){
            System.out.println("Negative Balance");
            throw e;

        }catch (OutOfLimitsException e){
            System.out.println("Exeeding");
            throw e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("Completed");

    }
}
