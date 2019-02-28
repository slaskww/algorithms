package org.sda.algorithms.exercises;

import java.util.LinkedList;

public class Queue {

    public static final int MAX_SIZE = 10;
    private LinkedList<Object> queue;

    public Queue() {

        queue = new LinkedList<>();
    }

    public void enqueue(Object o) {

        if (queue.size() == MAX_SIZE) {
            System.out.println("Queue is full");
            return;
        }
        queue.offer(o);

    }

    public Object dequeue() {

        if (queue.size() == 0) {
            System.out.println("Queue is empty");
            return null;
        }

        return queue.remove();
    }

    public Object peek() {

        return queue.peek();
    }

    public boolean isFull() {

        return queue.size() == MAX_SIZE;
    }

    public boolean isEmpty() {

        return queue.isEmpty();
    }

    public int size() {

        return queue.size();
    }
}
