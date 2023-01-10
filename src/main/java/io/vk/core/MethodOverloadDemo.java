package io.vk.core;

public class MethodOverloadDemo {

    //  Method overloading - multiple methods with same name in a class that have different parameters or
    //  parameter types in the method
    private String multiple() {
        return "";
    }

    private int multiple(boolean bool) {
        return bool ? 1 : -1;
    }

    public double multiple(int i) {
        return i * 6;
    }

    public static void main(String[] args) {
        MethodOverloadDemo overload = new MethodOverloadDemo();
        System.out.println(overload.multiple());
        System.out.println(overload.multiple(true));
        System.out.println(overload.multiple(5));
    }
}
