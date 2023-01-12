public class BinaryTree {
    static class Node {
        Node left, right;
        int key;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }


    Node root;

    BinaryTree() {
        root = null;
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.println(node.key);
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.println(node.key);
        inorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.key);

    }

    void preorder() {
        preorder(root);
    }

    void inorder() {
        inorder(root);
    }

    void postorder() {
        postorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        System.out.println("Preorder Transversal");
        tree.preorder();
        System.out.println("Inorder Transversal");
        tree.inorder();
        System.out.println("Postorder Transversal");
        tree.postorder();
    }
}
