package com.shilp.exercise;

public class Queue {
    QNode front, rear;
    int size = 0;

    public Queue() {
        front = rear = null;
    }

    void enqueue(int data) {
        QNode temp = new QNode(data);
        if (rear == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }

        size++;
    }

    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("empty queue");
        } else {
            QNode temp = front;
            front = front.next;
            temp.next = null;
            size--;
            return temp.data;
        }
    }

    public int size() {
        return size;

    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(5);
        System.out.println(queue.front.data);
        System.out.println(queue.dequeue());
        System.out.println(queue.size());

    }

}
