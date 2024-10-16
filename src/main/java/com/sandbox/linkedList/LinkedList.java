package com.sandbox.linkedList;

public interface LinkedList<E> {

    public abstract void addFirst(E value);
    public abstract void addLast(E value);

    public abstract E pollFirst();
    public abstract E pollLast();

    public abstract E peekFirst();
    public abstract E peekLast();

    void clear();
    boolean contains (E value);
    int size();
}
