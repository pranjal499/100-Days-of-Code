// package binary_trees_p3;

public class kth__level_tree {

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

    // Function to print K_th Level nodes:
    public static void KLevel(Node root, int level, int k) {
        // Base case:
        if (root == null) {
            return;
        }

        // Main work for recursion:
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }

        // recursive steps:
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static void main(String[] arg) {

        // Q. Kth Level of a Tree.
        // Print all the nodes which are present in kth level.

        // tree:
         /*
                        1
                       / \
                      2   3
                     / \  /\
                    4   5 6 7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.right.left = new Node(6);

        // Calling the function:
        int k = 3;
        KLevel(root, 1, k);
    }
}
