public class diameter_tree_app2 {

    // Class for Node:
    static class Node {
        int data; 
        Node left, right;

        // constructor for class:
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Info function:
    static class Info {
        int ht;
        int dia;

        // Constructor:
        public Info(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }

    // Diameter function:
    public static Info diameter(Node root) {
        // Base case:
        if (root == null) {
            return new Info(0, 0); // for returning 0 as a base case.
        }

        // Recursively get info from left and right subtrees:
        Info lInfo = diameter(root.left); // contains info of left root
        Info rInfo = diameter(root.right); // contains info of right root

        // Calculate diameter and height:
        int dia = Math.max(Math.max(lInfo.dia, rInfo.dia), lInfo.ht + rInfo.ht + 1); // contains maximum diameter.
        int ht = Math.max(lInfo.ht, rInfo.ht) + 1; // contains maximum height.

        return new Info(dia, ht); // return both diameter and height of the tree simultaneously.
    }

    public static void main(String[] args) {
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

        System.out.println("The max diameter of the tree is: " + diameter(root).dia);
    }
}
