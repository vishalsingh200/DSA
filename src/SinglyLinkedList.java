import java.util.Scanner;
class Node
{
    int roll_no;
    Node next;
}
public class SinglyLinkedList {
    Node START;
    SinglyLinkedList()
    {
        START = null;
    }
    void insert()
    {
    }
    void delete()
    {
    }
    void traverse()
    {
    }
    void deleteall()
    {
    }
}
class Singley
{
    public static void main(String[] args)
    {
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true)
        {
            System.out.println("\nPress 1 for insert ");
            System.out.println("Press 2 for delete ");
            System.out.println("Press 3 for traverse ");
            System.out.println("Press 4 for deleteall ");
            System.out.println("Press 5 for Exit ");

            System.out.println("Enter your choice ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    obj.deleteall();
                    break;
                default:
                    System.out.println("Wronge choice ");
                    break;
            }

        }
    }
}
