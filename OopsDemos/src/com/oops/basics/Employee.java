package com.oops.basics;

public class Employee {
    String employeename;
    int employeeId;
    double salary;

    public Employee(String employeename, int employeeId, double salary) {
        this.employeename = employeename;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void getDetails () {

        System.out.println("Name " + employeename);
        System.out.println("Id " + employeeId);
        System.out.println("salary " + salary);
    }

    String greet (String message){
        return message + " " + employeename;
    }
}
