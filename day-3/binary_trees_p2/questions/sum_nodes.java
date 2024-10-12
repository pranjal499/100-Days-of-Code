public class sum_nodes {

    // Node Class
    static class Node {
        int data;
        Node left, right;

        // Constructor of the class Node:
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to calculate sum of nodes: 
    public static int sum(Node root) {

        // Base case:
        if (root == null) {
            return 0;
        }

        // Work for recursion:
        int lSum = sum(root.left); // left sum
        int rSum = sum(root.right); // right sum

        return lSum + rSum + root.data; // Return the sum of nodes of the given tree.
    }

    public static void main(String[] arg) {

        // Q) Calculate the sum of Nodes:
        /*
                        1
                       / \
                      2   3
                     / \   \
                    4   5   6
        */

        // Adding Node to the tree:
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // printing statement for the sum function:
        System.out.println("The sum of the Nodes are: " + sum(root));
    }
}

/*
    Time complexity is O(n) --> Linear time complexity 
    Because the recursion covering each nodes of the tree.
*/