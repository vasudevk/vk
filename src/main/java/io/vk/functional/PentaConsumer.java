package io.vk.functional;


/**
 * This is a Consumer that takes
 *
 * @param <A>
 * @param <B>
 * @param <C>
 * @param <D>
 * @param <E> params as input and returns void
 */
@FunctionalInterface
public interface PentaConsumer<A, B, C, D, E> {
    void accept(A a, B b, C c, D d, E e);
}