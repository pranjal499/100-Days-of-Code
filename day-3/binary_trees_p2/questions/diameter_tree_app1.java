public class diameter_tree_app1 {

    // Node class:
    static class Node {
        int data;
        Node left, right;

        // constructor for class Node:
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to calculate height of the tree:
    public static int height(Node root) {
        // Base case:
        if (root == null) {
            return 0;
        }

        // Work:
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;  // returning the total height of the tree.
    }

    // Function for diameter:
    public static int diameter(Node root) {
        // Base case:
        if (root == null) {
            return 0;
        }

        // Work for recursion:
        int ld = diameter(root.left);
        int lh = height(root.left);
        int rd = diameter(root.right);
        int rh = height(root.right);

        int selfD = lh + rh + 1;
        return Math.max(selfD , Math.max(ld, rd)); // return the diameter of the tree.
    }

    public static void main(String[] args) {
        
        // Q.) Diameter of a tree:
        // No. of nodes in the longest path between two leaves.

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

        // Printing the diameter:
        System.out.println("The diameter of tree is: " + diameter(root));
    }
}

// O(n^2);
// Because to calculate the diameter the function is going each leaf of the tree --> linear time
// But and calcualting height in each instence with O(n) so when going n nodes with calculating height of n nodes the time complexity is: O(n^2);
