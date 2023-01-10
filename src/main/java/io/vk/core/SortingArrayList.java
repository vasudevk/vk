package io.vk.core;

import java.util.Collections;

import static io.vk.misc.GenericData.clubsList;


public class SortingArrayList {

    public static void main(String[] args) {

        System.out.println(clubsList);
        System.out.println("Unsorted List :: " + clubsList);

        Collections.sort(clubsList);
        System.out.println("Sorted Club List :: " + clubsList);

        clubsList.sort(Collections.reverseOrder());
        System.out.println("Reverse Sorted Club List :: " + clubsList);
    }
}