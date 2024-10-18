package com.sandbox.linkedList;

public interface LinkedList<E> {

    public abstract void addFirst(E element);
    public abstract void addLast(E element);

    public abstract E pollFirst();
    public abstract E pollLast();

    public abstract E peekFirst();
    public abstract E peekLast();

    void clear();
    boolean contains (E element);
    int size();
}
