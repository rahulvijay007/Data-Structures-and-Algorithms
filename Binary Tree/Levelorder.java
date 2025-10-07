
import java.util.Queue;

public class Levelorder
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
            if(node == null) {
                return;
            }
            Queue<Node> q = new java.util.LinkedList<>();
            q.add(node);
            q.add(null); // Marker for end of level
            while(!q.isEmpty())
            {
                Node cur = q.remove();
                if(cur == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(cur.data + " ");
                    if(cur.left != null) {
                        q.add(cur.left);
                    }
                    if(cur.right != null) {
                        q.add(cur.right);
                    }
                }
            }
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