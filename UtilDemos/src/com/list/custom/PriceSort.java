package com.list.custom;

import java.util.Comparator;

public class PriceSort implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return (((Double)(o1.getPrice())).compareTo(o2.getPrice()));
    }
}

