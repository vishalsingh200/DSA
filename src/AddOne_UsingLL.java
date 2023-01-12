public class AddOne_UsingLL {
    static class Node {
        int data;
        Node next;
    }
    static Node newnode(int data){
        Node new_node = new Node();
        new_node.next = null;
        new_node.data = data;
        return new_node;
    }
    static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    static Node add(Node head){
        Node res = head;
        Node temp  = null;
        Node prev = null;

        int carry = 1;
        int sum = 0;
        while (head!=null){
            sum = carry + head.data;
            carry = (sum>=0)?1:0;
            sum = sum%10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if(carry>0)
            temp.next = new Node();
        return res;
    }
    static  void print (Node node){

    }
    public static void main(String[] args) {

    }
}
