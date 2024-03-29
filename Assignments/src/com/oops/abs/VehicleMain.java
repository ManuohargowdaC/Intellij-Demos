package com.oops.abs;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle();
        vehicle.setModel("911 gt3");
        vehicle.getBrand("pulsor");
        vehicle.setPrice(150000);

        System.out.println(vehicle.getBrand("pulsor"));
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getPrice());
    }
}
