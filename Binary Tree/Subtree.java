public class Subtree {
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

        public static boolean same(Node root, Node subRoot)
        {
            if(root == null && subRoot == null)
                return true;
            if(root == null || subRoot == null)
                return false;
            if(root.data != subRoot.data)
                return false;

            boolean left = same(root.left, subRoot.left);
            boolean right = same(root.right, subRoot.right);

            return left && right;
        }

        public static boolean check(Node root, Node subRoot)
        {
            if(root == null)
                return false;
            if(root.data == subRoot.data)
            {
                if(same(root, subRoot))
                    return true;
            }

            boolean left = check(root.left, subRoot);
            boolean right = check(root.right, subRoot);

            return left || right;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(3);
        tree.root.left = new Node(4);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(2);
        tree.root.left.right.left = new Node(0);

        BinaryTree subTree = new BinaryTree();
        subTree.root = new Node(4);
        subTree.root.left = new Node(1);
        subTree.root.right = new Node(2);

        System.out.println(check(tree.root, subTree.root));
    }
    
}
