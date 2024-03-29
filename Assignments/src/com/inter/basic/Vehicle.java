package com.inter.basic;

public abstract class Vehicle implements IInsurence {
    String brand;
    String model;
    double price;

    @Override
    public void insurencesDetails() {

    }

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void getDetails(){
        System.out.println("brand"+brand+"model"+model+"price"+price);
    }
    abstract void getMailage();
}
