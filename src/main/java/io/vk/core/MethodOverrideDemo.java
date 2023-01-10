package io.vk.core;

public class MethodOverrideDemo implements IDemo {

    //  Interfaces are used to achieve abstraction in Java
    //  interfaces are abstract and public
    //  static & default methods should have body
    //  static methods cannot be overridden
    //  cannot contain constructors and hence they cannot be used to create objects

    @Override
    public void run() {
    }
}
