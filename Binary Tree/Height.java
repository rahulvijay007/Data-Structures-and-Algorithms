public class Height
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

        int height(Node node) {
            if (node == null) {
                return 0;
            }
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
            return Math.max(leftHeight, rightHeight) + 1;
            
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Height of the tree is: ");
        System.out.println(tree.height(tree.root));
    }
}