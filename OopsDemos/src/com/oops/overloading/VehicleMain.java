package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle();
        vehicle.getDetails();

        Vehicle vehicle1= new Vehicle("bajaj");
        vehicle1.getDetails();

        Vehicle vehicle2= new Vehicle("bajaj","pulsor");
        vehicle2.getDetails();

        Vehicle vehicle3= new Vehicle("bajaj",150000,"pulsor");
        vehicle3.getDetails();
    }
}
