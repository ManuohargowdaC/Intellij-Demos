package com.oops.basics;

public class Employee {
    String employeename;
    String designation;

    public Employee(String employeename, String designation) {
        this.employeename = employeename;
        this.designation = designation;
    }

    double caclcBonus(double basicAllowance){

        return basicAllowance;
    }

    double caclcBonus(double basicAllowance, String gift, double houseAllowance){
        System.out.println(gift);
        return  basicAllowance+houseAllowance;


    }

    double caclcBonus(double basicAllowance, String gift, double houseAllowance, double carAllowance){
        System.out.println(gift);
        return basicAllowance+houseAllowance+carAllowance;


    }

}
