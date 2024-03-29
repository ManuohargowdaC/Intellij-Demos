package com.util.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("Spring");
        list.add("node");
        list.add("angular");
        list.add("maven");
        System.out.println(list);
        list.addFirst("html");
        list.addLast("css");
        list.set(1,"react");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
    //    System.out.println(list);
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String val= iterator.next();
            System.out.println(val);
        }

    }
}
