package com.object.overriding;

public class Chinese extends Menu{
    @Override
    void showItems(String type) {
        if(type.equalsIgnoreCase("Starters"))
        {
            System.out.println("strters");
        } else if (type.equalsIgnoreCase("Lunch")) {
            System.out.println("Lunch");

        }
        else
            System.out.println("Deserts");
    }
    void printGames(){
        System.out.println("Chinese");
    }
}
