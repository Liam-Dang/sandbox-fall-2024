package com.sandbox.deque;

public interface Deque<E> {

    public abstract void offerFirst(E e);
    public abstract E pollFirst();
    public abstract E peekFirst();

    public abstract void offerLast(E e);
    public abstract E pollLast();
    public abstract E peekLast();

    public abstract boolean isEmpty();
}