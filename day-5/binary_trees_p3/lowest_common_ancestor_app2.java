// package binary_trees_p3;
import java.util.*;

public class lowest_common_ancestor_app2 {

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

    // Function to Lowest Common Ancestor:
    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return leftLca;
        }

        return root;
    }

    public static void main(String[] args) {
        
        // Approach - 2:

        // Tree structure:
        /*
                        1
                       / \
                      2   3
                     / \   \
                    4   5   6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1 = 4;
        int n2 = 5;

        System.out.println(lca(root, n1, n2).data);
    }
}
