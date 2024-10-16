package com.sandbox.deque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListDequeTest {

    private ArrayListDeque<Integer> testDeque;

    @BeforeEach
    void setUp() {
        testDeque = new ArrayListDeque<>();
    }

    @Test
    void offerFirst() {
        testDeque.offerFirst(1);
        testDeque.offerFirst(2);
        assertEquals(2, testDeque.peekFirst());
        assertEquals(1, testDeque.peekLast());
    }

    @Test
    void pollFirst() {
        testDeque.offerFirst(1);
        testDeque.offerFirst(2);
        assertEquals(2, testDeque.pollFirst());
        assertEquals(1, testDeque.pollFirst());
        assertTrue(testDeque.isEmpty());
    }

    @Test
    void peekFirst() {
        testDeque.offerFirst(1);
        assertEquals(1, testDeque.peekFirst());
        testDeque.offerFirst(2);
        assertEquals(2, testDeque.peekFirst());
    }

    @Test
    void offerLast() {
        testDeque.offerLast(1);
        testDeque.offerLast(2);
        assertEquals(1, testDeque.peekFirst());
        assertEquals(2, testDeque.peekLast());
    }

    @Test
    void pollLast() {
        testDeque.offerLast(1);
        testDeque.offerLast(2);
        assertEquals(2, testDeque.pollLast());
        assertEquals(1, testDeque.pollLast());
        assertTrue(testDeque.isEmpty());
    }

    @Test
    void peekLast() {
        testDeque.offerLast(1);
        assertEquals(1, testDeque.peekLast());
        testDeque.offerLast(2);
        assertEquals(2, testDeque.peekLast());
    }

    @Test
    void isEmpty() {
        assertTrue(testDeque.isEmpty());
        testDeque.offerFirst(1);
        assertFalse(testDeque.isEmpty());
    }

    @Test
    void pollFirstEmptyDeque() {
        assertThrows(IndexOutOfBoundsException.class, () -> testDeque.pollFirst());
    }

    @Test
    void pollLastEmptyDeque() {
        assertThrows(IndexOutOfBoundsException.class, () -> testDeque.pollLast());
    }

    @Test
    void peekFirstEmptyDeque() {
        assertThrows(IndexOutOfBoundsException.class, () -> testDeque.peekFirst());
    }

    @Test
    void peekLastEmptyDeque() {
        assertThrows(IndexOutOfBoundsException.class, () -> testDeque.peekLast());
    }

    @Test
    void offerNull() {
        testDeque.offerFirst(null);
        assertEquals(1, testDeque.deque.size());
        assertNull(testDeque.peekFirst());
    }

    @Test
    void toStringTest() {
        testDeque.offerFirst(1);
        testDeque.offerLast(2);
        assertEquals("ArrayListDeque{deque=[1, 2]}", testDeque.toString());
    }
}