import java.util.*;

public class lowest_common_ancestor {

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

    // getPath function:
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        // Base case:
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean leftFound = getPath(root.left, n, path);
        boolean rightFound = getPath(root.right, n, path);
        if (leftFound || rightFound) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    // Function to calculate the Lowest Common Ancestor (LCA):
    public static Node lca(Node root, int n1, int n2) {
        // ArrayLists containing paths of nodes:
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // Last common ancestor:
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (!path1.get(i).equals(path2.get(i))) {
                break;
            }
        }

        // Last equal node:
        Node lca = path1.get(i - 1);
        return lca;
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

        int n1 = 4;
        int n2 = 6;

        Node lcaNode = lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + (lcaNode != null ? lcaNode.data : "null"));
    }
}
