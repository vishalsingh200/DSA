import java.util.Scanner;

public class StackImplemetation_UsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(Scanner sc){
        System.out.println("Enter data:");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (top == null){
            top = new_node;
        }
        else {
            new_node.next = top;
            top = new_node;
        }
    }
    void pop(){
        if (top == null){
            System.out.println("Stack is empty");
        }
        else {
            top = top.next;
        }
    }
    void traverse(){
        Node temp = top;
        while (temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackImplemetation_UsingLL obj = new StackImplemetation_UsingLL();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nEnter 1 insert");
            System.out.println("Enter 2 delete");
            System.out.println("Enter 3 traverse");
            System.out.println("Enter 4 for Exit");
            System.out.println("Enter ur choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    obj.push(sc);
                    break;
                case 2 :
                    obj.pop();
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
