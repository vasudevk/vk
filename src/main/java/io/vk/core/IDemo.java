package io.vk.core;

public interface IDemo {
    void run();

    static void dance() {
    }

    default String play() {
        return "default interface method";
    }
}
