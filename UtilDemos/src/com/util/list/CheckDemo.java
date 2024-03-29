package com.util.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        List<String> nameStartsWithA = new ArrayList<>();
        List<String> nameStartsWithB = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Green apple");
        fruits.add("Orange");
        for (String fruit : fruits){
            if (fruit.startsWith("A")){
                nameStartsWithA.add(fruit);
            }
        }
        Iterator<String> iterator = nameStartsWithA.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        for (String fruit : fruits){
            if (fruit.startsWith("B")){
                nameStartsWithB.add(fruit);
            }
        }
        Iterator<String> iterator1 = nameStartsWithB.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
