package com.inter;

public class InterMain {
    public static void main(String[] args) {
        IEntertainment entertainment = new ManagerDetails();
        entertainment.showGames("indore");
        entertainment.showActivity();

        entertainment = new DeveloperDetails();
        entertainment.showGames("Outdoor");
        entertainment.showActivity();
    }
}
