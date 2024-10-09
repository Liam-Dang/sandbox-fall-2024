package com.sandbox.stacks;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListStackTest {

    @Test
    void testPushAndPop() {
        Stack<Integer> stack = new ArrayListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testPeek() {
        Stack<Integer> stack = new ArrayListStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        stack.pop();
        assertEquals(1, stack.peek());
    }

    @Test
    void testEmpty() {
        Stack<Integer> stack = new ArrayListStack<>();
        assertTrue(stack.empty());
        stack.push(1);
        assertFalse(stack.empty());
        stack.pop();
        assertTrue(stack.empty());
    }

    @Test
    void testSearch() {
        Stack<Integer> stack = new ArrayListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(0, stack.search(1));
        assertEquals(1, stack.search(2));
        assertEquals(2, stack.search(3));
        assertEquals(-1, stack.search(4));
    }

    @Test
    void testPopEmptyStack() {
        Stack<Integer> stack = new ArrayListStack<>();
        assertThrows(NoSuchElementException.class, stack::pop);
    }

    @Test
    void testPeekEmptyStack() {
        Stack<Integer> stack = new ArrayListStack<>();
        assertThrows(NoSuchElementException.class, stack::peek);
    }
}