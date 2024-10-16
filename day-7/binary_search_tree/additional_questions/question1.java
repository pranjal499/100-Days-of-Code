// package binary_search_tree.additional_questions;

public class question1 {

    // Node class:
    static class Node {
        int data;
        Node left;
        Node right;

        // constructor:
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to insert the values to bst:
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // inorder triversal function:
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    

    public static void main(String[] args) {
        
        // Q.1) Build an BST with the values of 1 - 10:
        int values[] = new int[10];
        // for loop to fill teh array with values:
        for (int i = 1; i <= 10; i++) {
            values[i - 1] = i;
        }

        Node root = null;

        // loop to inseart the values on tree:
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
    }
}
