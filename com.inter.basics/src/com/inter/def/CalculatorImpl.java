package com.inter.def;

public class CalculatorImpl implements IBonusCalculator,IAllowanceCalculator {
    @Override
    public void calculate(double amount) {
        System.out.println(amount*5);
    }
    public void policyType(){
        System.out.println("policy type for all employees");
//        IBonusCalculator.super.policyType();
//        IAllowanceCalculator.super.policyType();
    }
}
