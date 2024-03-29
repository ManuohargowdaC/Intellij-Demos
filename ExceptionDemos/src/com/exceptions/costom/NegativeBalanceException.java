package com.exceptions.costom;

public class NegativeBalanceException extends Exception {
    public NegativeBalanceException() {

    }
    public NegativeBalanceException(String message){
        super(message);
    }
}
