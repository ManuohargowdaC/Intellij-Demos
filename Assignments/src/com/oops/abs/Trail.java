package com.oops.abs;

public class Trail {
    static int x;
    static int y=x;
    static {
        System.out.println("In static block1");
        x=200;
    }

    static {
        System.out.println("In static block2");
        x=200;
    }
    static void getMassage(){
        System.out.println("in static method");
        System.out.println("Sum "+(x+y));
    }

    public static void main(String[] args) {
        System.out.println("in main");
        getMassage();
        System.out.println("Sum "+(x+y));
    }

}
