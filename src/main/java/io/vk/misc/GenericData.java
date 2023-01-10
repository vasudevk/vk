package io.vk.misc;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GenericData {

    public static final List<String> clubsList = new ArrayList<>();
    public static final Map<String, String> clubsMap = new HashMap<>();
    public static Set<String> placesSet = new HashSet<>();

    static Consumer<List<String>> listConsumer = list -> {
        list.add("Arsenal");
        list.add("Manchester United");
        list.add("Liverpool");
        list.add("Chelsea");
        list.add("Everton");
        list.add("Swansea");
        list.add("Newcastle United");
    };

    static Consumer<Map<String, String>> mapConsumer = map -> {
        map.put("Arsenal", "Pierre-Emerick Aubameyang");
        map.put("Manchester City", "Fernandinho");
        map.put("Liverpool", "Jordan Henderson");
        map.put("Aston Villa", "Jack Grealish");
        map.put("Manchester United", "Harry Maguire");
    };

    public static Supplier<Set<String>> setNycRestaurants = () -> {
        GenericData.placesSet = new HashSet<>();
        placesSet.add("Buvette");
        placesSet.add("Mercado Little Spain");
        placesSet.add("Teranga");
        placesSet.add("Upland");
        placesSet.add("Olmsted");
        placesSet.add("Adda Indian Canteen");
        return placesSet;
    };

    public static Supplier<Set<String>> setChicagoRestaurants = () -> {
        GenericData.placesSet = new HashSet<>();
        placesSet.add("Alinea");
        placesSet.add("Blackbird");
        placesSet.add("Oriole");
        placesSet.add("Spiaggia");
        placesSet.add("Acadia");
        placesSet.add("Boka");
        return placesSet;
    };

    public static Supplier<Set<String>> setDallasRestaurants = () -> {
        GenericData.placesSet = new LinkedHashSet<>();
        placesSet.add("Knife Dallas");
        placesSet.add("Khao Noodle Shop");
        placesSet.add("Uchi Dallas");
        placesSet.add("Town Hearth");
        placesSet.add("Mia's Tex-Mex");
        placesSet.add("Cattleack Barbeque");
        return placesSet;
    };


    static {
        mapConsumer.accept(clubsMap);
        listConsumer.accept(clubsList);
    }
}