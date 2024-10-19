public class validate_BST {

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

    // Function to insert the value:
    public static Node insert(Node root, int val) {
        // base case:
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // main work:
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Function to check bst:
    public static boolean isValidBST(Node root, Node min, Node max) {
        // base case: 
        if (root == null) {
            return true;
        }

        // main work:
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max); 
    }

    public static void main(String[] args) {
        
        // Q. Check weather the BST is valid or not:
        int values[] = {1, 1, 1, 1};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if (isValidBST(root, null, null)) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Not valid");
        }
    }
}
