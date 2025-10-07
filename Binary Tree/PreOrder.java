public class PreOrder {
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

    // preorder traversal: root → left → right
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = BinaryTree.build(nodes);  // ✅ static call

        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}
