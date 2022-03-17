import java.util.Scanner;

public class QueueImplementation_UsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;
    public void enQueue(){
        System.out.println("Enter data ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (front==null){
            front = new_node;
            rear = new_node;
        }
        else {
            rear.next = new_node;
            rear = new_node;
        }
    }
    public void deQueue(){
        if (front==null && rear==null){
            System.out.println("underflow");
        }
        else {
            front = front.next;
        }
    }
    public void traverse(){
        Node temp = front;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
}
class queueLL{
    public static void main(String[] args) {
        QueueImplementation_UsingArray obj = new QueueImplementation_UsingArray();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nEnter 1 enqueue");
            System.out.println("Enter 2 dequeue");
            System.out.println("Enter 3 traverse");
            System.out.println("Enter 4 for Exit");
            System.out.println("Enter ur choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    obj.enQueue(sc);
                    break;
                case 2 :
                    obj.deQueue();
                    break;
                case 3 :
                    obj.traverse();
                    break;
                case 4 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}
