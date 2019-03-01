package org.sda.algorithms.exercises;

public class Queue {


    private class QueueObject {

        Object o;
        QueueObject next;

        public QueueObject(Object o) {

            this.o = o;
            this.next = null;
        }
    }

    public static final int MAX_SIZE = 10;
    QueueObject head;
    QueueObject tail;
    int size;

    public Queue() {

        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(Object o) {

        if (size == MAX_SIZE) {
            System.out.println("Queue is full");
            return;
        }

        QueueObject newQObj = new QueueObject(o);
        size++;

        if (head == null) { //true if queue is empty

            head = newQObj;
            tail = newQObj;

        } else {

            tail.next = newQObj;
            tail = newQObj;

        }
    }

    public Object dequeue() {

        if (size == 0) {

            System.out.println("Queue is empty");
            return null;

        } else if (size == 1) {

            size--;
            Object object = head.o;
            head = null;
            tail = null;
            return object;

        } else {

            size--;
            Object object = head.o;
            head = head.next;
            return object;

        }
    }

    public Object peek() {

        return head.o;
    }

    public boolean isFull() {

        return size == MAX_SIZE;
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public int size() {

        return size;
    }

}

/*{
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
}*/
