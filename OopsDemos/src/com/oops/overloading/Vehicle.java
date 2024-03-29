package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;


    public Vehicle() {

        System.out.println("Default");

    }

    public Vehicle(String brand) {
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
        this(brand);
        System.out.println("two");
        this.brand = brand;
    }

    public Vehicle(String brand, double price, String model) {
        this(model,brand);
        System.out.println("three");
        this.brand = brand;
    }
    void getDetails(){

        if(brand!=null) {
            System.out.println("the brand of the vehicle " + brand);
        }
        if(price>=0)
            System.out.println("the price of the vehicle " + price);

        if(model!=null)
            System.out.println("the model of the vehicle " + model);
        }
    }

