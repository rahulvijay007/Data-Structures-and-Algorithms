public class PrintInRange{
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
    public static void perform(Node root, int key)
    {
        if(root==null)
        {
            System.out.println("Key not found");
            return;
        }
        if(root.data==key)
        {
            System.out.println("Key found");
            return;
        }
        if(key<root.data)
        {
            perform(root.left,key);
        }
        else
        {
            perform(root.right,key);
        }
    }
    public static void print(Node root, int k1, int k2)
    {
        if(root==null)
        {
            return;
        }
        if(root.data>=k1 && root.data<=k2)
        {
            print(root.left,k1,k2);
            System.out.print(root.data+" ");
            print(root.right,k1,k2);
        }
        else if(root.data<k1)
        {
            print(root.right,k1,k2);
        }
        else
        {
            print(root.left,k1,k2);
        }
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
        int key=10;
        perform(root,key);
        key=7;
        perform(root,key);
        int k1=4,k2=10;
        System.out.println("The values in the range "+k1+" to "+k2+" are:");
        print(root,k1,k2);
    }
}
 
