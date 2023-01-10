package io.vk.functional;

@FunctionalInterface
public interface TriFunction<S, I, V, R> {

    R apply(S s, I i, V v);

}
