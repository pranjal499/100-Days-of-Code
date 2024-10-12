// package questions;

public class height_tree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Function to calculare no. of nodes:
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int lCount = count(root.left);
        int rCount = count(root.right);
        return lCount + rCount + 1;
    }

    public static void main(String[] args) {
        
        // Calculate the height of a tree.

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

        System.out.println(height(root));
        System.out.println();
        System.out.println(count(root));
    }
}
