package io.vk.functional;

/**
 * This is a Consumer that takes
 *
 * @param <S>
 * @param <I>
 * @param <V>
 * @param <R> params as input and returns void
 */
@FunctionalInterface
public interface QuadConsumer<S, I, V, R> {

    void accept(S s, I i, V v, R r);
}