class Node0{
    int data;
    Node0 next;
    Node0(int x){
        data = x;
        next = null;
    }
}
public class InsertAtBegningSinglyLL {
    static Node0 insert(Node0 head, int x) {
        Node0 obj = new Node0(x);
        obj.next = head;
        return head;
    }


    public static void main(String[] args) {
        Node0 head = null;
        head = insert(head, 30);
        head = insert(head, 20);
        head = insert(head, 10);
    }

    public static void printList(Node0 head) {
        Node0 curr = head;
        while (curr != null) {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }

    }
}

