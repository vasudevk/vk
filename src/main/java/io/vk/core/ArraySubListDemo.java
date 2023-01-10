package io.vk.core;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static io.vk.misc.GenericData.clubsList;


public class ArraySubListDemo {


    final static int chunkSize = 2;

    public static void main(String[] args) {

        for (int i = 0; i < clubsList.size(); i += chunkSize) {
            List<String> chunkedList = clubsList.subList(i, Math.min(i + chunkSize, clubsList.size()));
            System.out.println(chunkedList);
        }

        clubsList.add("Brighton");
        clubsList.add("Burnley");
        AtomicInteger count = new AtomicInteger();
        Map<Integer, List<String>> chunkedMap = clubsList.stream()
                .collect(Collectors.groupingBy(s -> count.getAndIncrement() / chunkSize));
        chunkedMap.forEach((k, v) -> System.out.println("List " + k + " : " + v));
    }
}