import java.util.*;
public class RootToLeaf {
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
    public static void print(Node root, ArrayList<Integer> path)
    {
        if(root == null)
            return;
        path.add(root.data);
        if(root.left == null && root.right == null)
        {
            for(int i=0; i<path.size(); i++)
                System.out.print(path.get(i)+" ");
            System.out.println();
            return;
        }
        print(root.left, path);
        print(root.right, path);
        path.remove(path.size() - 1);
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
    }
}
