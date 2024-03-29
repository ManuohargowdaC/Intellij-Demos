package com.inter.def;

public class ShaoeLambda {
    public static void main(String[] args) {
        IShape iShape= (int x, int y)->{
            System.out.println("rect "+(x*y));
        };
        iShape = (x,y)-> System.out.println("Tri "+(0.5*x*y));
        iShape.area(20,20);
    }
}
