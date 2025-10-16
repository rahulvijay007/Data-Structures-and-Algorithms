public class delete {
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

    public static Node remove(Node root, int val)
    {
        if(root.data<val)
        root.right=remove(root.right,val);
        else if(root.data>val)
        root.left=remove(root.left,val);
        else
        {
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
            root.data=minValue(root.right);
            root.right=remove(root.right,root.data);
        }
        return root;
    }
    public static int minValue(Node root)
    {
        int minv=root.data;
        while(root.left!=null)
        {
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }

    public static void main(String args[]) {
        int[] val = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < val.length; i++)
            root = insert(root, val[i]);

        System.out.println("BST created:");
        inorder(root);
        System.out.println("The tree looks like this:");
        System.out.println("        5        ");
        System.out.println("      /   \\     ");
        System.out.println("     1     7    ");
        System.out.println("      \\         ");
        System.out.println("       3       ");
        System.out.println("      / \\      ");
        System.out.println("     2   4     ");
        int key=3;
        root=remove(root,key);
        System.out.println("After deleting "+key+" the new BST is:");
        inorder(root);
        
    }
}
