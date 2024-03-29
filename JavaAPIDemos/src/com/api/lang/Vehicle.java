package com.api.lang;
import java.lang.Object;
import java.util.Objects;

public class Vehicle {
    private String color;
    private String model;
    private String brand;


    public Vehicle() {
    }

    public Vehicle(String color, String model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(color, vehicle.color) && Objects.equals(model, vehicle.model) && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, brand);
    }
}
