package com.sandbox.queues;

public interface Queue<E> {

    public abstract boolean offer(E e);
    public abstract  E poll();
    public abstract  E peek();
    boolean isEmpty();
}
