package com.list.custom;

import java.util.Comparator;

public class BrandSort implements Comparator<Vehicle> {
    @Override
    public Comparator<Vehicle> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
       // return o1.getBrand().compareTo(o2.getBrand());
        return o1.getModel().compareTo(o2.getModel());

    }
}
