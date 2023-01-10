package io.vk.misc;

import io.vk.core.SingletonDemo;
import io.vk.core.ThreadSafeSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Editor {

    // TODO https://stackoverflow.com/questions/14930073/how-to-check-if-a-string-is-balanced

    static Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
    static Map<String, Object> hashtable = new Hashtable<>();
    static Map<String, Object> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
    static List<String> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();
    static List<Object> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    static List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
    static Vector<String> vector = new Vector<>();

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final var phone = new int[]{9, 1, 1};
        // phone = new int[]{2, 4, 6}; // cannot alter the structure of final variables
        phone[0] = 8;
        System.out.println(Arrays.toString(phone));

        Integer pay = 10000;
        Integer bonus = 10000;
        System.out.println(pay == bonus);
        System.out.println(pay.equals(bonus));
        Class<?> aClass = Class.forName("io.vk.core.StringDemo");
        System.out.println(aClass.getConstructor());

        System.out.println("Hello World!");
        System.out.println(10);
        System.out.println(new char[]{'a', 'b', 'c'});

        Logger logger = LoggerFactory.getLogger(Editor.class);


        SingletonDemo s = SingletonDemo.getInstance();
        System.out.println(s);

        Constructor constructor = SingletonDemo.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonDemo o = (SingletonDemo) constructor.newInstance();
        System.out.println(o);

        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstanceWithoutOverhead();
        Constructor c = ThreadSafeSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        ThreadSafeSingleton tss = (ThreadSafeSingleton) c.newInstance();
        System.out.println(tss);
    }
}