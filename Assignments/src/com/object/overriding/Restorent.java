package com.object.overriding;

public class Restorent {
    public static void main(String[] args) {


        Menu menu = new Chinese();
        menu.showItems("Starters");

         menu = new Indian();
         menu.showItems("Starters");

        Chinese chinese = (Chinese)menu;
        chinese.printGames();
    }
}
