package com.api.lang;

public class HashDemo {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Black","Audi","X100");
        Vehicle vehicle2 = new Vehicle("white","Audi","X100");
        Vehicle vehicle3 = new Vehicle("white","Audi","A100");
        Vehicle vehicle4 = new Vehicle("white","Audi","AX3");

        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());
    }
}
