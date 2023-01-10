package io.vk.core;

public class ThreadSafeSingleton {

    static volatile ThreadSafeSingleton singletonInstance; // volatile to make the object thread-safe

    // private constructor to prevent outside access
    private ThreadSafeSingleton() {
        if (null != singletonInstance)
            throw new RuntimeException("Illegal Access"); // to avoid member access through reflection
    }

    // public static method to get the instance
    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == singletonInstance) singletonInstance = new ThreadSafeSingleton();
        return singletonInstance;
    }

    // getInstance is not synchronized but the block which creates instance is synchronized so that
    // minimum number of threads have to wait and that’s only for first time.
    public static ThreadSafeSingleton getInstanceWithoutOverhead() {
        if (null == singletonInstance)
            synchronized (ThreadSafeSingleton.class) { // synchronized block for thread-safety while initializing the singleton
                singletonInstance = new ThreadSafeSingleton();
            }
        return singletonInstance;
    }
}