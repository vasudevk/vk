package io.vk.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vk.misc.GenericData;
import io.vk.objects.Tour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiPredicate;

public class DeepCopyDemo {

    public static final Logger log = LoggerFactory.getLogger(DeepCopyDemo.class);

    static BiPredicate<Object, Object> compare = (o, o2) -> o == o2;

    public static void main(String[] args) throws CloneNotSupportedException, JsonProcessingException {

        Tour tour = new Tour();
        tour.setCity("NYC");
        tour.setRestaurants(GenericData.setNycRestaurants.get());

        Tour clone = (Tour) tour.clone();

        log.info(compare.test(tour, clone) ? "Shallow Copy" : "Deep Copy");
        log.info(compare.test(tour.getRestaurants(), clone.getRestaurants()) ? "Shallow Copy" : "Deep Copy");

        log.info("Tour :: {}", new ObjectMapper().writeValueAsString(tour));
        log.info("Clone :: {}", new ObjectMapper().writeValueAsString(clone));

        clone.setCity("Dallas");
        clone.setRestaurants(GenericData.setDallasRestaurants.get());
        log.info(compare.test(tour, clone) ? "Shallow Copy" : "Deep Copy");

        log.info("Tour :: {}", new ObjectMapper().writeValueAsString(tour));
        log.info("Clone :: {}", new ObjectMapper().writeValueAsString(clone));
    }
}
