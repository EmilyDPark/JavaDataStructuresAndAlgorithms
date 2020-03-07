package com.company;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    } // Node class

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        size++;
    } // addLast method

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        size++;
    } // addFirst method

    private boolean isEmpty() {
        return first == null;
    } // isEmpty method

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    } // indexOf method

    public boolean contains(int item) {
        return indexOf(item) != 1;
    } // contains method

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        size--;
    } // removeFirst method

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }

        size--;
    } // removeLast method

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    } // getPrevious method

    public int size() {
        return size;
    } // size method

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    } // toArray method

    public void reverse() {
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    } // reverse method

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    } // getKthFromTheEnd

    public void printList() {
        if (isEmpty()) return;

        var current = first;
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("{");
        while (current != null && current.next != null) {
            System.out.print(current.value + ", ");
            current = current.next;
        }
        if (current != null && current.next == null) {
            System.out.print(current.value);
        }
        System.out.print("}");
        System.out.println();
    } // printList method

} // LinkedList class
