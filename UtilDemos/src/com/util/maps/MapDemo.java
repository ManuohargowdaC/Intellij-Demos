package com.util.maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
//        Map<Integer,String> hashMap = new LinkedHashMap<>();
//        Map<Integer,String> hashMap = new TreeMap<>();
        hashMap.put(1,"java");
        hashMap.put(10,"Spring");
        hashMap.put(8,"Node");
        hashMap.put(null,"css");
        hashMap.put(null,"angular");
        hashMap.put(5,"html");
        hashMap.put(1,"react");
        hashMap.put(100,null);
        hashMap.put(101,null);
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(102));
        System.out.println(hashMap.getOrDefault(102,"jsp"));
        System.out.println(hashMap.containsKey(1));
        hashMap.values();

        System.out.println( );
        Set<Integer> keys = hashMap.keySet();
        for (Integer key:keys){
            System.out.println(key+" "+hashMap.get(key));
        }

        System.out.println();
        System.out.println("Using entry set");
        Set<Map.Entry<Integer,String>> entries = hashMap.entrySet();

        for (Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+" \t"+entry.getValue());
        }
//        System.out.println();
//        for (Map.Entry<Integer,String> entry:hashMap.entrySet()){
//            Integer key = entry.getKey();
//            String val = entry.getValue();
//            System.out.println(key+" "+val);
//        }
    }
}
