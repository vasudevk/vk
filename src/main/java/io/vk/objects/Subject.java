package io.vk.objects;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subject implements Cloneable {

    private Set<String> subjects;

    public Subject() {
        subjects = new HashSet<>(Arrays.asList("Maths", "Science", "English", "History"));
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
