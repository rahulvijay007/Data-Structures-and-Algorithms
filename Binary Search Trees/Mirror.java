public class Mirror {
    
    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

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

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
    public static void main(String args[]) {
        int[] val = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < val.length; i++)
            root = insert(root, val[i]);

        System.out.println("BST created:");
        inorder(root);
        System.out.println("\nThe tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     1     7    ");
        System.out.println("      \\         ");
        System.out.println("       3       ");
        System.out.println("      / \\      ");
        System.out.println("     2   4     ");

        root = mirror(root);
        System.out.println("Inorder traversal of the mirrored tree:");
        inorder(root);
        System.out.println("\nThe mirrored tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     7     1    ");
        System.out.println("          /     ");
        System.out.println("         3      ");
        System.out.println("       /   \\    ");
        System.out.println("      4     2   ");
    }
}
