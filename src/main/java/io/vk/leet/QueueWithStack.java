package io.vk.leet;

import java.util.Stack;

public class QueueWithStack<E> {
    private Stack<E> s1 = new Stack<>();
    private Stack<E> s2 = new Stack<>();

    public void enqueue(E e) {
        s1.push(e);
    }

    public E dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }
}

class Runner {
    public static void main(String[] args) {
        QueueWithStack<Integer> q1 = new QueueWithStack<>();
        q1.enqueue(6);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
    }
}
