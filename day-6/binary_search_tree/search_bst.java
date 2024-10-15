package binary_search_tree;

public class search_bst {

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

    // Insert function:
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

    // Function for inorder triversal:
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        
        // Searching a key value in bst:
        int values[] = new int[5];
    }
}
