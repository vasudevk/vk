package io.vk.core;

import io.vk.objects.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.BiPredicate;

public class ShallowCopyDemo {

    public static final Logger log = LoggerFactory.getLogger(ShallowCopyDemo.class);

    static BiPredicate<Object, Object> compare = (o, o2) -> o == o2;

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Vasu", 30);
        Student s2;

        s2 = (Student) s1.clone();

        log.info(compare.test(s1, s2) ? "Shallow Copy" : "Deep Copy");
        log.info(compare.test(s1.getSubjects(), s2.getSubjects()) ? "Shallow Copy" : "Deep Copy");

        s2.getMap().put("Vk", 29);
        log.info(String.valueOf(s1.getMap()));
        log.info(String.valueOf(s2.getMap()));
        log.info(compare.test(s1.getMap(), s2.getMap()) ? "Shallow Copy" : "Deep Copy");
    }
}