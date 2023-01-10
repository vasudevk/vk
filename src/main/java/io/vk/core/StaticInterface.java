package io.vk.core;

public interface StaticInterface {

    // Refer to One Note notes
    static boolean overrideStaticMethodFromInterface() {
        return true;
    }

    void regularMethod();
}
