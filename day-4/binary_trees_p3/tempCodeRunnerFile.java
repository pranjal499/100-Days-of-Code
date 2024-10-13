package binary_trees_p3;

public class min_dist_between_nodes {

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

    // Function for Lowest common ancestor:
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

    // Function for lca distanca:
    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        else if (rightDist == -1) {
            return leftDist + 1;
        }
        else {
            return rightDist + 1;
        }
    }

    // Function for min distance:
    public static Node minDist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1).data;
        int dist2 = lcaDist(lca, n2).data;

        return dist1 + dist2;
    }

    public static void main(String[] args) {
        
        // Q. Min. Distance between nodes:

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
        int n2 = 6;

        System.out.println(minDist(root, n1, n2));
    }
}
