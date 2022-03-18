import java.util.Scanner;
public class Queue_UsingArray {
    int Front = -1;
    int Rare  = -1;
    int n = 5;
    int arr[] = new int[5];

    void enQueue(Scanner sc){
        if(Rare == arr.length-1){
            System.out.println("Overerflow");
        }
        else {
            System.out.println("Enter data :");
            int i = sc.nextInt();
            if(Front == -1 && Rare == -1){
                Front = 0;
                Rare = 0;
                arr[Rare] = i;
            }
            else {
                Rare = Rare+1;
                arr[Rare] = i;
            }
        }
    }
    void deQueue(){
        if(Front == -1 && Rare == -1){
            System.out.println("Underflow");
        }
        else {
            Front = Front+1;
        }
    }
    void traverse(){
        System.out.println("items are :");
        for (int i = Front; i<=Rare; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue_UsingArray obj = new Queue_UsingArray();
        while (true){
            System.out.println("\nEnter 1 insert");
            System.out.println("Enter 2 delete");
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