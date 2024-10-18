package com.sandbox.linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void addFirst() {
        list.addFirst("first");
        assertEquals("first", list.peekFirst());
        list.addFirst("second");
        assertEquals("second", list.peekFirst());
    }

    @Test
    void addLast() {
        list.addLast("first");
        assertEquals("first", list.peekLast());
        list.addLast("second");
        assertEquals("second", list.peekLast());
    }

    @Test
    void pollFirst() {
        list.addFirst("first");
        list.addFirst("second");
        assertEquals("second", list.pollFirst());
        assertEquals("first", list.pollFirst());
        assertNull(list.pollFirst());
    }

    @Test
    void pollLast() {
        list.addLast("first");
        list.addLast("second");
        assertEquals("second", list.pollLast());
        assertEquals("first", list.pollLast());
        assertNull(list.pollLast());
    }

    @Test
    void peekFirst() {
        list.addFirst("first");
        list.addFirst("second");
        assertEquals("second", list.peekFirst());
        list.pollFirst();
        assertEquals("first", list.peekFirst());
    }

    @Test
    void peekLast() {
        list.addLast("first");
        list.addLast("second");
        assertEquals("second", list.peekLast());
        list.pollLast();
        assertEquals("first", list.peekLast());
    }

    @Test
    void clear() {
        list.addFirst("first");
        list.addLast("second");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void contains() {
        list.addFirst("first");
        list.addLast("second");
        assertTrue(list.contains("first"));
        assertTrue(list.contains("second"));
        assertFalse(list.contains("third"));
    }

    @Test
    void size() {
        assertEquals(0, list.size());
        list.addFirst("first");
        assertEquals(1, list.size());
        list.addLast("second");
        assertEquals(2, list.size());
        list.pollFirst();
        assertEquals(1, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    void testToString() {
        assertEquals("[]", list.toString());
        list.addFirst("first");
        assertEquals("[first]", list.toString());
        list.addLast("second");
        assertEquals("[first, second]", list.toString());
    }
}