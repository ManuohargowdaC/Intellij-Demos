package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComapreLambda {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle("City", "Honda", 2390000),
                new Vehicle("Hexa", "TATA", 1290000),
                new Vehicle("Santro", "Hyundai", 4500000),
                new Vehicle("A10", "Audi", 5600000),
                new Vehicle("X10", "Maruthi", 850000));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
        Collections.sort(vehicles,((o1, o2) -> o1.getBrand().compareTo(o2.getBrand())));
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicles);
        }
        System.out.println("By Brand");
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }

    }
}
