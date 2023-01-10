package io.vk.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Collections maintain an internal counter called modCount.
 * Each time an item is added or removed from the Collection, this counter gets incremented.
 * <p>
 * When iterating, on each next() call, the current value of modCount gets compared with the initial value.
 * If there's a mismatch, it throws ConcurrentModificationException which aborts the entire operation.
 */
public class FailFastDemo {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);


        // This can be replace with Collection.removeIf() since internally it uses iterator.remove()
        Iterator<Integer> iter = integers.iterator();
        while (iter.hasNext()) {
            if (iter.next() == 30)
                iter.remove();
        }
        System.out.println("Removing elements using iterators remove() :: " + integers);

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 40)
                // ConcurrentModification is thrown since we're removing an element using
                // ArrayList's remove method during iteration
                integers.remove(1);
        }
        System.out.println(integers);
    }
}