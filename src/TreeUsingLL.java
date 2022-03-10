import java.util.Scanner;

class Node1{
    int data;
    Node1 left;
    Node1 right;
    public Node1(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class TreeUsingLL {
    static Node1 create(){
        Scanner sc = new Scanner(System.in);
        Node1 root = null;
        System.out.println("Enter value ");
        int data = sc.nextInt();7

        if (data == -1)
            return null;
        root = new Node1(data);
        System.out.println("Enter the letf child " + root.left);
        root.left = create();
        System.out.println("Enter the right child " + root.right);
        root.right = create();
        return root;
    }

    public static void main(String[] args) {
        Node1 root = create();
    }
}

