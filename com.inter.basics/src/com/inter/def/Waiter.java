package com.inter.def;

public class Waiter {
    void availableItems(IMenu menu){
        System.out.println("Welcome to my hotel");
        menu.showMenus();
        System.out.println("Order Now");
    }
}
