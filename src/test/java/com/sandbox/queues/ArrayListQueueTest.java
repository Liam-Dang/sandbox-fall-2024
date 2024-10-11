package com.sandbox.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListQueueTest {

    private ArrayListQueue<Integer> queue;

    @BeforeEach
    void setUp() {
        queue = new ArrayListQueue<>();
    }

    @Test
    void offer() {
        assertTrue(queue.offer(1));
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.peek());
        assertEquals(1, queue.getQueue().get(0));
    }

    @Test
    void poll() {
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.poll());
        assertEquals(2, queue.poll());
        assertTrue(queue.isEmpty());
    }

    @Test
    void peek() {
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.peek());
        queue.poll();
        assertEquals(2, queue.peek());
    }

    @Test
    void isEmpty() {
        assertTrue(queue.isEmpty());
        queue.offer(1);
        assertFalse(queue.isEmpty());
        queue.poll();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testToString() {
        assertNotNull(queue.toString());
    }


}