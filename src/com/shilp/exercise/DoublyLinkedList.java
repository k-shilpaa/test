package com.shilp.exercise;

public class DoublyLinkedList {
    public static DNode head;

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.push(2);
        dList.push(3);
        dList.insert(2,5);
        dList.print();

    }

    public void push(int data) {
        DNode node = new DNode(data);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

    public void print() {
        DNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void insert(DNode prev, int data) {
        if (prev == null) {
            return;
        }
        DNode node = new DNode(data);
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if (node.next != null) {
            node.next.prev = node;
        }


    }
    public  void insert(int prev,int data){
        DNode node=find(prev);
        insert(node,data);
    }
    public DNode find(int data){
        DNode current=head;
        while (current!=null && current.data!=data){
            current=current.next;
        }
        return current;
    }

}
