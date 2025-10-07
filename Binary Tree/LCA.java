import java.util.*;

public class LCA {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Standard recursive LCA that returns the node reference (or null)
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) return null;

        // If either n1 or n2 matches root's data, root is part of LCA path
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        // If both sides return non-null, this root is LCA
        if (leftLca != null && rightLca != null) {
            return root;
        }

        // Otherwise return the non-null side (or null)
        return (leftLca != null) ? leftLca : rightLca;
    }

    // Optional: safe getPath if you ever want to use path method
    public static boolean getPath(Node root, int n, ArrayList<Integer> path) {
        if (root == null) return false;

        path.add(root.data);

        if (root.data == n) return true;

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        // not in this path
        path.remove(path.size() - 1);
        return false;
    }

    // Example main building the tree and testing LCA
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // The tree:
        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */

        int n1 = 4, n2 = 5;
        Node ans = lca(root, n1, n2);
        if (ans != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + ans.data);
        } else {
            System.out.println("One or both nodes not present in the tree.");
        }

        // Another test: nodes on different subtrees
        n1 = 4; n2 = 6;
        ans = lca(root, n1, n2);
        if (ans != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + ans.data);
        } else {
            System.out.println("One or both nodes not present in the tree.");
        }
    }
}
