package com.wardendev.hillelproject.list;

import java.util.Iterator;

/**
 * Single linked list that uses nodes that store next element.
 * @implNote Added descriptions
 * @param <T> the type of elements to store
 */
public class SingleLinkedList<T> implements Iterable<T> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    /**
     * Node class stores data and next element, creating chain
     * @param <T> the type of data to store
     */
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data); 

        if(head == null) head = newNode;
        else if(head.next == null) {
            tail = newNode;
            head.next = tail;
        }
        else {
            Node<T> current = head;
            while(current.next != tail) current = current.next;
            Node<T> copy = new Node<T>(tail.data);
            current.next = copy;
            tail = newNode;
            copy.next = tail;
            // Node<T> current = head;
            // while (current.next != null) current = current.next;
            // tail = newNode;
            // current.next = tail;
        }

        size++;
    }

    /**
     * Removes first element from list
     */
    public void removeFirst() {
        if (head == null) return;
            
        head = head.next;
        size--;
    }

    /**
     * Removes last element from list
     */
    public void removeLast() {
        if(head == null) return;

        if (head.next == null){
            head = null;
            size--;
            return;
        }

        Node<T> current = head;
        while(current.next.next != tail) current = current.next;
        tail.data = current.next.data;
        current.next = tail;
        size--;



        // Node<T> current = head;
        // while (current.next.next != null) {
        //     current = current.next;
        // }
        // current.next = null;
        // size--;
    }

    /**
     * Converts this list to basic array
     * @return array of {@code T}s
     * 
     */
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) new Object[size];

        Node<T> current = head;

        for (int i = 0; i < array.length; i++) {
            if(current != null) {
                array[i] = current.data;
                current = current.next;
            }
            else break;
        }

        return array;
    }

    /**
     * Prints the list
     */
    public void print() {
        for(T element : toArray()) System.out.print(element + " ");
    }

    /**
     * Gets an element by the index
     * @param index index of element
     * @return element of type {@code T}
     * 
     */
    public T get(int index) {
        if (index < 0) throw new IndexOutOfBoundsException();

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) throw new IndexOutOfBoundsException();
            current = current.next;
        }
        return current.data;
    }

    /**
     * Gets size of list
     * @return list of size
     */
    public int size() {
        return size;
    }

    public void set(int index, T data) {
        if (index < 0) throw new IndexOutOfBoundsException();

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) throw new IndexOutOfBoundsException();
            current = current.next;
        }
        current.data = data;
    }
}