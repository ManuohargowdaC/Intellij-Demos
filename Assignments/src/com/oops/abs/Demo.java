package com.oops.abs;

public class Demo {
    static {
        System.out.println("in demo static method");
    }

    public static void main(String[] args) {
        System.out.println("main demo");
        try {
            Class.forName("com.oops.abs.Demo");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
