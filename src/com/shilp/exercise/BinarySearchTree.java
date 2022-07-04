package com.shilp.exercise;

public class BinarySearchTree {
    public BNode root;

    void insert(int data) {
        root = insertR(root, data);
    }

    BNode insertR(BNode root, int data) {
        if (root == null) {
            root = new BNode(data);
            return root;
        } else {
            if (root.data < data) {
                root.right = insertR(root.right, data);
            } else {
                root.left = insertR(root.left, data);
            }
        }
        return root;
    }

    void postorder() {
        postorderR(root);
    }

    void postorderR(BNode root) {
        if (root != null) {
            postorderR(root.left);
            postorderR(root.right);
            System.out.print(root.data + " ");
        }
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(BNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderR(root);
    }

    void preorderR(BNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderR(root.left);
            preorderR(root.right);
        }
    }

    void delete(int key) {
        root = deleteR(root, key);
    }

    BNode deleteR(BNode root, int data) {
        if (root == null)
            return root;
        if (data < root.data)
            root.left = deleteR(root.left, data);
        else if (data > root.data)
            root.right = deleteR(root.right, data);
        else {
            // if root.data == data, this node should be deleted

            // if only right child
            if (root.left == null)
                return root.right;
            // if only left child
            else if (root.right == null)
                return root.left;

            // find inorder sucessor, which is minimum value on right subtree
            // this is a suitable candidate for root.
            root.data = minvalue(root.right);
            root.right = deleteR(root.right, root.data);
        }
        return root;
    }


    public int minvalue(BNode root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(5);
        bst.insert(6);
        bst.delete(5);
        System.out.println("inorder traversal of the given tree");
        bst.inorder();
        System.out.println("postorder traversal of the given tree");
        bst.postorder();
        System.out.println("preorder traversal of the given tree");
        bst.preorder();


    }
}
