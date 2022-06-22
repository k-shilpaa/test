package com.shilp.exercise;

public class BinaryTree {
    public Node root;



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);

        Node left = root.left;
        left.left = new Node(1);
        left.right = new Node(4);

        left = left.left;
        left.left = new Node(-1);
        left.right = new Node(2);

        Node right = root.right;
        right.left = new Node(6);
        right.right = new Node(8);


        tree.inorderTraversal(root);
        System.out.println();
        tree.preorderTraversal(root);
        System.out.println();
        tree.postorderTraversal(root);
    }


    public void inorderTraversal(Node root){
        if(root!=null){
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);

        }
    }

    public void preorderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

    }


    public void postorderTraversal(Node root){
        if(root!=null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }




}