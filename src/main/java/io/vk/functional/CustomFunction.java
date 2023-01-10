package io.vk.functional;

@FunctionalInterface
public interface CustomFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}