public class AddSumOfNodeBS {
    static class Node {
        int item;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            item = data;
            left = null;
            right =null;
            nextRight = null;
        }
    }
    Node root;
    static  int sumNode(Node node){
        if (node == null)
            return 0;
        return (sumNode(node.left)+sumNode(node.right));
    }
}

