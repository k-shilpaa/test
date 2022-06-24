package com.shilp.exercise;

import java.util.LinkedList;

public class SinglyLinkedList {
    public SNode head;


    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.add(4);
       // sList.removeLast();
        sList.remove(2);
        sList.print();

    }

    public void print() {
        SNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public void add(int n) {
        if (head == null) {
            head = new SNode(n);
        } else {
            SNode current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = new SNode(n);
        }


    }

    public int removeLast() {
        int result = -1;
        //if list has only one element
        if (head == null) {
            return result;
        }
        if (head.next == null) {
            result = head.data;
            head = null;
        } else {
            SNode current = head;
            result = 0;
            while (current.next.next != null) {
                current = current.next;
            }
            result = current.next.data;
            current.next = null;
        }
        return result;


    }

    /*

              1 -> 2-> 3-> 4
             */
    public int remove(int i) {
        int res=-1;
        if (head == null) {
            return -1;
        } else if (head.next == null && head.data==i) {
            res= head.data;
            head = null;
        } else {
            SNode current = head;
            SNode prev =null;
            while(current.next!=null && current.data!=i ){
                prev=current;
                current=current.next;
            }
            if(prev==null){
                head=current.next;
            }
            else {
                prev.next = current.next;
            }
            res = current.data;
        }
        return res;
    }
}







