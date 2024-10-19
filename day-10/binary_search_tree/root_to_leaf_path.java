import java.util.*;

public class root_to_leaf_path {

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

    // Insert function:
    public static Node insert(Node root, int val) {
        // Base case:
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // Main work:
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // printPath function:
    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    // Function for root to leaf path:
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        // Base case:
        if (root == null) {
            return;
        }

        // Add current node to the path
        path.add(root.data);

        // If it's a leaf node, print the path
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        else {
            // Recur for the left and right subtrees
            printRootToLeaf(root.left, path);
            printRootToLeaf(root.right, path);
        }

        // Remove current node from path before backtracking
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // Print all possible paths from root to leaf:
        int values[] = {1, 3, 4, 5, 6, 8, 10, 11, 14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // Start the root-to-leaf path printing
        printRootToLeaf(root, new ArrayList<>());
    }
}
