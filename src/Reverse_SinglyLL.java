//Given the head of a singly linked list, reverse the list, and return the reversed list.
//Example 1:
//        Input: head = [1,2,3,4,5]
//        Output: [5,4,3,2,1]
//
class Reverse_SinglyLL{
static Node head;

static class Node {

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args)
    {
        Reverse_SinglyLL list = new Reverse_SinglyLL();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
