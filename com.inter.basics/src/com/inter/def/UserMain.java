package com.inter.def;

public class UserMain {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.availableItems(()-> System.out.println("gobi,chilly chicken, noodels"));

        }
    }

