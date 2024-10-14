public class k_th_ancestor_node {

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

    // Function for kth ancestor:
    public static int kAncestor(Node root, int n, int k) {

        // base case:
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = kAncestor(root.left, n, k); // Contain left distance
        int rightDist = kAncestor(root.right, n, k); // contain right distance

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        
        // Q. Kth Ancestor of nodes:

        // Tree structure:
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
        root.right.right = new Node(6);
        root.right.left = new Node(7);

        int n = 5;
        int k = 1;

        kAncestor(root, n, k);
    }
}
