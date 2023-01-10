package io.vk.core;

import java.util.*;
import java.util.function.Predicate;

public class MapsDemo {

    public static final String DERBY_COUNTY = "D";

    static Predicate<String> removeKey = r -> r.contains(DERBY_COUNTY);

    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Arsenal");
        stringMap.put("B", "Burnley");
        stringMap.put("C", "Chelsea");
        stringMap.put("D", "Derby County");

        // Since keys are unique, a Set is returned
        Set<String> keySet = stringMap.keySet();

        // Since values can have duplicates, a Collection is returned
        Collection<String> values = stringMap.values();

        System.out.println(keySet);
        System.out.println(values);

        // Remove key using Iterator
        Iterator<Map.Entry<String, String>> iterator = stringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry next = iterator.next();
            if (next.getKey().equals(DERBY_COUNTY)) {
                iterator.remove();
                System.out.println("Removed " + next);
            }
        }

        // Remove key using Collection.removeIf()
        stringMap.entrySet().removeIf(x -> removeKey.test(x.getKey()));
        System.out.println(stringMap);
    }
}