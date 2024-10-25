package com.sandbox.linkedList;


import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {
        Node newNode = new Node(element, head); //1,2

        if (head == null) {
            head = newNode; // 3
            tail = head;
        } else {
            head = newNode; // 3
        }

    }

    @Override
    public void addLast(E element) {
        Node newNode = new Node(element,null); //1

        if (tail == null) {
            tail = newNode; //2
            head = newNode;
        } else {
            tail.next = newNode; //3
            tail = newNode; //4
        }
    }

    @Override
    public E pollFirst() {
        E element;
        if (head == null) {
            element = null;
        } else {
            element = head.element; //1
            if (head == tail) {
                head = null; //2
                tail = null;
            } else {
                Node next = head.next; //3
                head.next = null; // optional
                head = next; //4
            }
        }
        return element;
    }

    @Override
    public E pollLast() {

        E element;
        if (tail == null) {
            element = null;
        } else {
            element = tail.element; //1
            if (head == tail) { // one element in the list
                head = null;
                tail = null;
            } else { //more than one element in the list
                Node current = head; //3
                while (current.next != tail) {
                    current = current.next; //4
                }
                current.next = null; //5
                tail = current; //6
            }

        }
        return element;
    }

    // O(1)
    @Override
    public E peekFirst() {

        E returnValue = null;
        if (head != null) {
            returnValue = head.element;
        }
        return returnValue;
    }

    // O(1)
    @Override
    public E peekLast() {

        E returnValue = null;
        if (tail != null) {
            returnValue = tail.element;
        }
        return returnValue;
    }

    // O(n)
    @Override
    public void clear() {

        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            current = next;
        }
        head = null;
        tail = null;

    }

    // O(n)
    @Override
    public boolean contains(E element) {

        boolean found = false;
        Node current = head;
        while (current != null) {
            if (current.element.equals(element)) {
                found = true;
                break;
            }
            current = current.next;
        }

        return found;
    }

    // O(n)
    @Override
    public int size() {
        int counter =0;

        if (head != null) { // list is not empty

            //more than one element in the list
            Node current = head;
            while (current != null) {
                counter++;
                current = current.next;
            }
        }

        return counter;
    }

    // O(mn)
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;
        if (current != null) {
            while (current != null) {
                joiner.add(current.element.toString());
                current = current.next;
            }
        }
        builder.append(joiner);
        builder.append("]");

        return builder.toString();
    }

    private class Node {

        E element;
        Node next;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }

    }
}
