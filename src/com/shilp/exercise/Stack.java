package com.shilp.exercise;

public class Stack {
    public StackNode root;
    private int size = 0;

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pushdata(5);
        stack.pushdata(12);
        stack.pushdata(11);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.peak());


        System.out.println(stack.peak());
        System.out.println(stack.isEmpty());

    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public void pushdata(int data) {
        StackNode node = new StackNode(data);
        if (root == null) {
            root = node;
        } else {
            StackNode temp = root;
            root = node;
            node.next = temp;
        }
        size++;
        System.out.println(data);
    }

    public int peak() {

        if (root == null) {
            throw new RuntimeException("empty stack");
        } else {
            return root.data;
        }

    }

    public int pop() {
        if (root == null) {
            return -1;
        } else {
            int pop = root.data;
            root = root.next;
            size--;
            return pop;

        }

    }

    public int size() {
        return size;
    }

}