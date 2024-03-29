package com.oops.inheritence;

public class InManager extends InEmployee {
    double salary;

    public InManager(String employeeName, int employeeId) {
        super(employeeName, employeeId);
    }

    public InManager(String employeeName, int employeeId, double salary) {
        super(employeeName, employeeId);
        this.salary = salary;


    }
    void printBounce(double amount){

        System.out.println("bonus "+(amount+salary));
    }
}
