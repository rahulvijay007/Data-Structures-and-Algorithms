public class KthLevel {
    public static class Node {   // public static to avoid warning
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        public static Node build(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }
    public static void print(Node root, int level, int k)
    {
        if(root == null)
        {
            return;
        }
        if(level == k)
        {
            System.out.print(root.data + " ");
            return;
        }
        print(root.left, level + 1, k);
        print(root.right, level + 1, k);
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        //The tree looks like this:
        /*         1
                 / \
                2   3
               / \   \
              4   5   6
        */  

        Node root = BinaryTree.build(nodes);  // ✅ static call
        int k = 2;
        System.out.println("Nodes at level " + k + " :");
        print(root, 0, k);
    }
}
