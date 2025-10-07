public class Postorder
{
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
    public static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        void Traversal(Node node) {
            if (node == null) {
                return;
            }

            // Traverse the left subtree
            Traversal(node.left);

            // Traverse the right subtree
            Traversal(node.right);

            // Visit the current node
            System.out.print(node.data + " ");

            
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal of the binary tree:");
        tree.Traversal(tree.root);
    }
}