public class SortedToBalanced
{
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
    public static Node balanced(int[] arr, int start, int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid = (start+end)/2;
        Node node = new Node(arr[mid]);
        node.left = balanced(arr, start, mid-1);
        node.right = balanced(arr, mid+1, end);
        return node;
    }
    public static void main(String[] args) {
        int[] val = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < val.length; i++)
            root = insert(root, val[i]);

        System.out.println("BST created:");
        inorder(root);
        System.err.println("");
        System.out.println("The tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     1     7    ");
        System.out.println("      \\         ");
        System.out.println("       3       ");
        System.out.println("      / \\      ");
        System.out.println("     2   4     ");
        System.out.println("");
        int[] arr = {1,2,3,4,5,7};
        Node balancedRoot = balanced(arr, 0, arr.length-1);
        System.out.println("Balanced BST created:");
        inorder(balancedRoot);
        System.out.println("");
        System.out.println("The balanced tree looks like this:");
        System.out.println("        3        ");
        System.out.println("      /   \\     ");
        System.out.println("     2     5    ");
        System.out.println("    /     / \\   ");
        System.out.println("   1     4   7  ");

    }

}
