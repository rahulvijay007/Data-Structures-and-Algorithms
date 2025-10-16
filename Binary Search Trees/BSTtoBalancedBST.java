import java.util.ArrayList;

public class BSTtoBalancedBST {

    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);
        return root;
    }

    // Inorder traversal to collect values
    public static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    // Build balanced BST from sorted array
    public static Node balanced(ArrayList<Integer> arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node node = new Node(arr.get(mid));
        node.left = balanced(arr, start, mid - 1);
        node.right = balanced(arr, mid + 1, end);
        return node;
    }

    // Print inorder traversal
    public static void printInorder(Node root) {
        if (root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        int[] val = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int v : val)
            root = insert(root, v);

        System.out.println("BST created (Inorder traversal):");
        printInorder(root);
        System.out.println("\n");
        System.out.println("The tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     1     7    ");
        System.out.println("      \\         ");
        System.out.println("       3       ");
        System.out.println("      / \\      ");
        System.out.println("     2   4     ");
        System.out.println();

        // Convert BST to Balanced BST
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        Node balancedRoot = balanced(arr, 0, arr.size() - 1);

        System.out.println("Balanced BST (Inorder traversal):");
        printInorder(balancedRoot);
        System.out.println();
        System.out.println("The balanced tree looks like this:");
        System.out.println("        3        ");
        System.out.println("      /   \\     ");
        System.out.println("     2     5    ");
        System.out.println("    /     / \\   ");
        System.out.println("   1     4   7  ");
    }
}
