public class print_in_range {

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

    // Function to print in range:
    public static void printInRange(Node root, int k1, int k2) {
        // Base case:
        if (root == null) {
            return;
        }

        // If the root's data is greater than or equal to k1, then only we should
        // recur for the left subtree
        if (root.data >= k1) {
            printInRange(root.left, k1, k2);
        }

        // If the root's data is in the range, then print it
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        // If the root's data is less than or equal to k2, then only we should
        // recur for the right subtree
        if (root.data <= k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        // Print the node values in range from starting value and the ending value inclusive:
        // In this case: k1 = 5, k2 = 12;
        // Include those values which lie in this range and if any value is not present in the tree but still in the range then skip that value and go to next.
        
        // Inserting values on BST:
        int values[] = {1, 3, 4, 5, 6, 8, 10, 11, 14};
        Node root = null;
        
        // Loop to insert all the values of the array to the tree:
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        
        // Printing the values in the range
        printInRange(root, 5, 12);
    }
}
