package com.oops.inheritence;

public class InEmployee {
    String employeeName;
    int employeeId;

    public InEmployee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    void getDetails(){

        System.out.println(employeeName+" "+employeeId);
    }
}
