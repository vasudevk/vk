package io.vk.core;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class demonstrates multiple ways to remove duplicates in an ArrayList
 */

public class DuplicateArrayList {

    public static void main(String[] args) {

        List<String> initialList = new ArrayList<>();
        initialList.add("Manchester United");
        initialList.add("Arsenal");
        initialList.add("Manchester United");
        initialList.add("Liverpool");
        initialList.add("Chelsea");
        initialList.add("Arsenal");
        initialList.add("Arsenal");
        initialList.add("Chelsea");
        initialList.add("Manchester United");
        System.out.println(" Initial List ");
        System.out.println(initialList);

        List<String> list1 = new ArrayList<>(initialList);
        list1.add("Everton");
        list1.add("Swansea");
        list1.add("Newcastle United");
        list1.add("Swansea");
        list1.add("Everton");
        list1.add("Chelsea");
        list1.add("Manchester United");

        initialList = removeUsingStream.apply(initialList);
        System.out.println(" Removing duplicates using distinct() ");
        System.out.println(initialList);

        list1 = removeUsingSet.apply(list1);
        System.out.println(" Removing duplicates using LinkedHashSet ");
        System.out.println(list1);
    }


    /**
     * Remove duplicates in a list using LinkedHashSet since it maintains the insertion order
     */
    static Function<List<String>, List<String>> removeUsingSet = d -> new ArrayList<>(new LinkedHashSet<>(d));

    /**
     * Remove duplicates in a list using distinct() from Streams
     */
    static Function<List<String>, List<String>> removeUsingStream = d -> d.stream().distinct().collect(Collectors.toList());
}