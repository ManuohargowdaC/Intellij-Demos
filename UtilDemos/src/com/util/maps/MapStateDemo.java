package com.util.maps;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Bangalore","Kolar","Chikkaballapur"));
        stateMap.put("Maharastra", Arrays.asList("Karad","Satara","Pune"));
        stateMap.put("Telangana", Arrays.asList("Hyderabad","Warangal","Secunderabad"));
        stateMap.put("Kerala", Arrays.asList("Munnar","Kochi","Thiruvananthapuram"));


        Set<String> state = stateMap.keySet();

//        for (String state : stateMap.keySet()){
//            System.out.println(state+" "+stateMap.get(state));
//        }
        System.out.println(state+" "+stateMap.get(state));



    }
}
