package io.vk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Ticker ticker = new Ticker("NFLX", 1000);
        // ticker.refresh(); // illegal - 'refresh()' is private
        Method refresh = ticker.getClass().getDeclaredMethod("refresh");
        refresh.setAccessible(true);
        refresh.invoke(ticker);
    }
}

record Ticker(String name, double price) {
    private void refresh() {
        System.out.println("refresh! " + name + " - " + price * Math.random());
    }
}
