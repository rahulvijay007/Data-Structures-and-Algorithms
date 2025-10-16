public class validate {
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
    public static boolean isValid(Node root, Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }
        if(min != null && root.data <= min.data)
        {
            return false;
        }
        else if(max != null && root.data >= max.data)
        {
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }
    public static void main(String args[]) {
        int[] val = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < val.length; i++)
            root = insert(root, val[i]);

        System.out.println("BST created:");
        System.out.println("The tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     1     7    ");
        System.out.println("      \\         ");
        System.out.println("       3       ");
        System.out.println("      / \\      ");
        System.out.println("     2   4     ");
        System.out.println("Inorder traversal of the tree:");
        inorder(root);
        System.out.println();
        if(isValid(root, null, null))
        {
            System.out.println("The tree is a valid BST");
        }
        else
        {
            System.out.println("The tree is not a valid BST");
        }

        val[3] = 45;
        root = null;
        for (int i = 0; i < val.length; i++)
            root = insert(root, val[i]);
        System.out.println("BST created:");
        System.out.println("The tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     1     7    "); 
        System.out.println("      \\         ");
        System.out.println("       3       ");
        System.out.println("      / \\      ");
        System.out.println("     2   8     ");
        System.out.println("Inorder traversal of the tree:");
        inorder(root);
        System.out.println();
        if(isValid(root, null, null))
        {
            System.out.println("The tree is a valid BST");
        }
        else
        {
            System.out.println("The tree is not a valid BST");
        }

    }
    
}
