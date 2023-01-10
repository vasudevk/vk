package io.vk.core;

import java.util.HashMap;
import java.util.Map;

public class StaticBlockDemo {

    private static final Map<String, String> captainMap = new HashMap<>();

    Map<String, String> captainMaps = new HashMap<>();


    /* These blocks are used to initialize static variables */
    static {
        captainMap.put("Arsenal", "Pierre-Emerick Aubameyang");
        captainMap.put("Manchester City", "Fernandinho");
        captainMap.put("Liverpool", "Jordan Henderson");
        captainMap.put(null, "Old Null");
        captainMap.put(null, "New Null");
    }

    static {
        captainMap.put("Aston Villa", "Jack Grealish");
        captainMap.put("Manchester United", "Harry Maguire");
    }

    public static void main(String[] args) {
        captainMap.forEach((k, v) -> System.out.println("Captain of " + k + " is " + v));
    }
}
