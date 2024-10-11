package com.sandbox.queues;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> implements Queue<T>{

    protected List<T> queue;

    public ArrayListQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public boolean offer(T t) {
        if (this.queue != null) {
            this.queue.add(0,t);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public T poll() {
        T returnValue = null;
        try {
            returnValue= this.queue.removeLast();
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty");
            returnValue = null;
        }
        return returnValue;
    }

    @Override
    public T peek() {
        T returnValue = null;
        try {
            returnValue = this.queue.getLast();
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty");
            returnValue = null;
        }
        return returnValue;
    }

    @Override
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public List<T> getQueue() {
        return queue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayListQueue{");
        sb.append('}');
        return sb.toString();
    }
}
