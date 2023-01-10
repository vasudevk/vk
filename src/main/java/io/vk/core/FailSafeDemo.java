package io.vk.core;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {

    public static void main(String[] args) {


        List<String> strings = new CopyOnWriteArrayList<>();
        strings.add("Vasu");
        strings.add("VK");
        strings.add("Dev");
        strings.add("Test");

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("VK".equalsIgnoreCase(next))
                strings.remove(next);
        }
        System.out.println("Doesn't fail since we're modifying " + strings);


        // UnsupportedOperationException is thrown since we're modifying the iterator
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if ("Test".equalsIgnoreCase(next))
                it.remove();
        }
        System.out.println(it);
    }
}
