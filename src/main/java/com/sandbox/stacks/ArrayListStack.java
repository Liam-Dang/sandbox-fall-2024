package com.sandbox.stacks;

import java.util.ArrayList;
import java.util.List;


public class ArrayListStack<T> implements Stack<T> {

    private List<T> stack;

    public ArrayListStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }

    @Override
    public T peek() {
        return this.stack.getLast();
    }

    @Override
    public T pop() {
        return this.stack.removeLast();
    }

    @Override
    public void push(T item) {
        this.stack.addLast(item);
    }

    @Override
    public int search(T item) {
        return this.stack.lastIndexOf(item);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ArrayListStack{");
        sb.append("stack=").append(stack);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println("Empty? " + stack.empty());
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("Search for 3: " + stack.search(3));
        System.out.println(stack);
        System.out.println("Search for 6: " + stack.search(6));
        System.out.println(stack);
    }
}
