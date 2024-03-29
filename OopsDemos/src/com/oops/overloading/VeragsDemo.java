package com.oops.overloading;

public class VeragsDemo {
    void calcSum(String name, int... marks){
        System.out.println("welcome "+name);
        int sum=0;
        for(int mark:marks)
            sum += mark;

        System.out.println("sum "+sum);
    }
    void calcSum(String name){
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {
        VeragsDemo demo = new VeragsDemo();
        demo.calcSum("Sri",90,80,90);
        demo.calcSum("priya");
        demo.calcSum("Roni",90,80);
    }
}
