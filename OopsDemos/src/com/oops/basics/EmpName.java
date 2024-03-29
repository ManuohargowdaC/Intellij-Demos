package com.oops.basics;

public class EmpName {
    public static void main(String[] args) {
        Employee employee = new Employee("Raju",12,2000);


        employee.getDetails();
        String greetEmployee = employee.greet("welcom");
        System.out.println(greetEmployee);
    }
}
