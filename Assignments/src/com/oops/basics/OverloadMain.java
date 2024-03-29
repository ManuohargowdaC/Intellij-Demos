package com.oops.basics;

import java.util.Scanner;

public class OverloadMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Employee[] employeeList = new Employee("Manohar","Manager");
        for (int i = 0; i < 3; i++) {

            String employeename=scanner.next();
            String designation=scanner.next();
            Employee employeeList = new Employee("Manohar", "Manager");

            if (designation.equals("programer"))
                employeeList.caclcBonus(2200);

            else if (designation.equals("Manager"))
                employeeList.caclcBonus(2200,"car",200);

            else
                employeeList.caclcBonus(2200,"Laptop",200,220);

        }
    }
}
