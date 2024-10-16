package com.sandbox.deque;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDeque<T> implements Deque<T> {

    protected List<T> deque;

    public ArrayListDeque() {
        deque = new ArrayList<>();
    }

    @Override
    public void offerFirst(T t) {
        this.deque.add(0, t);
    }

    @Override
    public T pollFirst() {
        return this.deque.remove(0);
    }

    @Override
    public T peekFirst() {
        return this.deque.get(0);
    }

    @Override
    public void offerLast(T t) {
        this.deque.add(deque.size(), t);
    }

    @Override
    public T pollLast() {
        return this.deque.remove(deque.size() -1);
    }

    @Override
    public T peekLast() {
        return this.deque.get(deque.size() -1);
    }

    @Override
    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayListDeque{");
        sb.append("deque=")
          .append(deque);
        sb.append('}');
        return sb.toString();
    }
}