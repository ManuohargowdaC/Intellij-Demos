package com.inter.def;

public class ShapeFactory {
    void printArea(IShape shape,int x,int y){
        System.out.println("Printing Area");
        shape.area(x,y);
        System.out.println("Completed");
    }
}
