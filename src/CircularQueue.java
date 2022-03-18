import java.util.Scanner;

public class CircularQueue {
    int front = -1;
    int rear = -1;
    int n = 10;
    int arr[] = new int[n];

    public void enQueue(Scanner sc){
        if (rear == (rear+1)%n){
            System.out.println("overflow");
        }
        else {
            System.out.println("Enter data :");
            int i = sc.nextInt();
            if(front == -1 && rear == -1){
                front = 0;
                rear = 0;
                arr[rear] = i;
            }
            else {
                rear = (rear+1)%n;
                arr[rear] = i;
            }
        }
    }
    public void deQueue(){
        if(front == -1 && rear == -1){
            System.out.println("Underflow");
        }
        else if (front == rear){
            System.out.println("underflow");
            front = -1;
            rear = -1;
        }
        else {
            front = (front+1)%n;
        }
    }
    public void traverse(){
        System.out.println("Items are :");
        for (int i = front; i!=rear; i=(i+1)%n){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
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
//