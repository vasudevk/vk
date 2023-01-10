package io.vk.functional;

public class CustomFunctionDemo {

    static CustomFunction<String, String, Integer, Object> customFunction = (a, b, i) -> a.length() * b.length() * i;


    public static void main(String[] args) {
        System.out.println(customFunction.apply("My Name is ", "Vasudev Koneru", 1991));
    }
}
