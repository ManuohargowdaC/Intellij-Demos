package com.inter.def;

public class MenuLambda {
    public static void main(String[] args) {
        IMenu iMenu = ()-> System.out.println("These are chinese food");
        IMenu iMenu1 = ()-> System.out.println("These are Indian food");
        IMenu iMenu2 = ()-> System.out.println("These are Italian food");

        iMenu.showMenus();
        iMenu1.showMenus();
        iMenu2.showMenus();
    };

}
