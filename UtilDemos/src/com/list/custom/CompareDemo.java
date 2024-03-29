package com.list.custom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
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
        System.out.println("Sort By Brand");
        Collections.sort(vehicles,new BrandSort());
        Collections.sort(vehicles,new PriceSort());
        Collections.sort(vehicles,new ModelSort());

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);

        }
//        System.out.println(" ");
//        Collections.sort(vehicles);
//        System.out.println("...............");


//        for (Book vehicle : vehicles) {
//            System.out.println(vehicles);
//        }
    }


}
