package com.exceptions.costom;

public class VoyaAtm {
    public static void main(String[] args) throws OutOfLimitsException, NegativeBalanceException {
        VoyaBank voyaBank = new VoyaBank(10000);
        voyaBank.withdraw(100);
    }
}
