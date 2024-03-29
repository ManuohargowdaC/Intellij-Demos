package com.inter;

public class ManagerDetails implements IEntertainment {
    @Override
    public void showGames(String type) {
        if (type.equalsIgnoreCase("indore"))
            System.out.println("Chess and table tennis avilable");
        else
            System.out.println("football");
    }

    @Override
    public void showActivity() {
        System.out.println("monthly trip with developers");

    }
}
