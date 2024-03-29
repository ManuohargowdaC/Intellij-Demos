package com.Threds.Basic;

public class Greetings {
    public String sayHello(String name){
        String result = "Welcome "+name;
        try {
            System.out.println("Hi "+name);
            Thread.sleep(1000);
            result = "Great Day "+name;
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return result;
    }
}
