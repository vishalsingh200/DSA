import java.util.Scanner;

public class SinglyLL_Implementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insert(){

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null){
                head = new_node;
            }
            else{
                System.out.println("\nEnter 1 at begning");
                System.out.println("Enter 2 at end");
                System.out.println("Enter 3 at specific_Position");
                System.out.println("Enter 4 Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp!=null){
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.println("Enter position of node to inter");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i =0; i<p-1; i++){
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                    case 4 :
                        System.exit(0);
                        break;
                }
            }

        }

    }
    public void delete(){

        Scanner sc = new Scanner(System.in);
        while (true){
            if(head == null){
                System.out.println("LL is empty");
            }
            else{
                System.out.println("\nEnter 1 at begning");
                System.out.println("Enter 2 at end");
                System.out.println("Enter 3 at specific_Position");
                System.out.println("Enter 4 for Exit");
                int choice = sc.nextInt();
                switch (choice){
                    case 1 :
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2 :
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next!=null){
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3 :
                        System.out.println("Enter position of node to deleted");
                        int p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0 ; i<p-2; i++){
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                    case 4 :
                        System.exit(0);
                        break;
                }
            }
        }
    }
    public void traverse(){
        if(head == null){
            System.out.println("ll does not exit");
        }
        else {
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        SinglyLL_Implementation obj = new SinglyLL_Implementation();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter 1 insert");
            System.out.println("Enter 2 delete");
            System.out.println("Enter 3 traverse");
            System.out.println("Enter 4 for Exit");
            System.out.println("Enter ur choice");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                    obj.insert();
                    break;
                case 2 :
                    obj.delete();
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

