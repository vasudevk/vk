package io.vk.objects;


import io.vk.misc.GenericData;

import java.util.HashSet;
import java.util.Set;

public class Tour implements Cloneable {

    private String city;
    private Set<String> restaurants;
    private Set<String> sightseeing;

    public Tour() {
        restaurants = GenericData.setNycRestaurants.get();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Tour tour = (Tour) super.clone();
        tour.restaurants = new HashSet<>(this.restaurants);
        return tour;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<String> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<String> restaurants) {
        this.restaurants = restaurants;
    }
}
