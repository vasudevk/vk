package io.vk.objects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student implements Cloneable {

    private String name;
    private int age;

    private Subject subjects;
    private Map<String, Integer> map;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

        map = new HashMap<>() {{
            put(name, age);
        }};

        subjects = new Subject();
    }

    @Override
    public String toString() {
        return Arrays.asList(name, String.valueOf(age),
                subjects.toString()).toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Set<String> getSubjects() {
        return subjects.getSubjects();
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
