// package additional_questions;

public class transform_sum_tree {

    // Node class:
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor:
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to calculate sum:
    public static int transform(Node root) {
        // Base case:
        if (root == null) {
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
    }

    // Function to print the tree:
    public static void print(Node root) {
        // Base case:
        if (root == null) {
            return;
        }

        // Work:
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        
        // Q. Transform to Sum Tree:

        /*  
               1
             /   \
            2     3
           / \   / \
          4   5 7   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        transform(root);
        print(root);
    }
}


// Approach:
/*
    - go last child of the tree one by one.
    - null --> 0.
    - null + null = 0 --> replace that sum with current node's value.
    - until root node.

    - Base case:
        - if (root = null) --> return 0;
    - iterate left and right child of the tree.
    - node.data = leftChild + rightChild.
    - store the previous node's value for future reference.
*/
