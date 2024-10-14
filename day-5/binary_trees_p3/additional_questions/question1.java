// package additional_questions;
public class question1 {

    // Node class represents each node in the binary tree
    static class Node {
        int data;  // value of the node
        Node left; // left child
        Node right; // right child

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to find the Lowest Common Ancestor (LCA) of two given nodes
    public static Node lca(Node root, int n1, int n2) {
        // Base case: if root is null or matches one of the nodes, return root
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        
        // Recur for left and right subtrees
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        // If one node is found in each subtree, root is the LCA
        if (leftLca == null) {
            return rightLca;
        }
        if (rightLca == null) {
            return leftLca;
        }
        return root;
    }

    // Function to calculate the distance from the LCA to a given node
    public static int lcaDist(Node root, int n) {
        // Base case: if root is null, return -1 (not found)
        if (root == null) {
            return -1;
        }
        // If the node is found, return 0
        if (root.data == n) {
            return 0;
        }

        // Recur for left and right subtrees
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        // If the node is found in either subtree, return distance + 1
        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        return (leftDist != -1 ? leftDist : rightDist) + 1;
    }

    // Function to calculate the distance between two nodes
    public static int dist(Node root, int n1, int n2) {
        // Find the lowest common ancestor of the two nodes
        Node lca = lca(root, n1, n2);

        // Calculate the distance from LCA to each node
        int dist1 = lcaDist(root, n1);
        int dist2 = lcaDist(root, n2);

        // Return the sum of distances
        return dist1 + dist2;
    }

    public static void main(String[] args) {
        // Q.1) Write a program to find the distance between two nodes in a binary tree.
        // Tree structure:
        /*  
              1
             / \
            2   3
           / \   / \
          4   5 7   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);

        int n1 = 4; // First node
        int n2 = 7; // Second node
        
        // Print the distance between n1 and n2
        System.out.println(dist(root, n1, n2));
    }
}
