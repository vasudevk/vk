package io.vk.functional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vk.objects.Log;

import java.util.*;
import java.util.stream.Collectors;

import static io.vk.misc.GenericData.clubsMap;


public class ComparatorDemo {

    public static void main(String[] args) {

        // TODO - https://howtodoinjava.com/java/sort/groupby-sort-multiple-comparators/

        List<Log> logs = new ArrayList<>();
        logs.add(new Log(10, "Vasu"));
        logs.add(new Log(6, "Dev"));
        logs.add(new Log(15, "Koneru"));

        logs.forEach(l -> {
            try {
                System.out.println("Before Sorting :: " + new ObjectMapper().writeValueAsString(l));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });
        logs.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));

        logs.forEach(l -> {
            try {
                System.out.println("After Sorting :: " + new ObjectMapper().writeValueAsString(l));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });

        logs.sort(Comparator.comparingInt(Log::getTimeTaken).reversed());
        logs.forEach(l -> {
            try {
                System.out.println("After Sorting Twice :: " + new ObjectMapper().writeValueAsString(l));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        });

        LinkedHashMap<String, String> sortedClubMap = clubsMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, LinkedHashMap::new));
        System.out.println(sortedClubMap);

    }
}