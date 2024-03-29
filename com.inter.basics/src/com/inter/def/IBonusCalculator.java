package com.inter.def;

public interface IBonusCalculator {
    void calculate(double amount);
    default void policyType(){
        System.out.println("Policy for bonus");
    }
    static void show(){
        System.out.println("show the data");
    }
}
