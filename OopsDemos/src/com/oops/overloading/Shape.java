package com.oops.overloading;

public class Shape {

    void calcArea(int length){
        System.out.println("sq "+(length*length));
    }
    int calcArea(int length, int breadth)
    {
        return length*breadth;
    }
    void calcArea(double radius)
    {
        System.out.println("circle "+ Math.PI*Math.pow(radius,2));
    }
    double calcArea(double base, int height)
    {
        return (0.5*base*height);
    }
}
