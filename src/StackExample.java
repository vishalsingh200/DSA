import java.util.Scanner;
public class StackExample {
    int arr[];
    int top;
    StackExample(){
        arr = new int[5];
        top = -1;
    }
    void push(){
        Scanner sc = new Scanner(System.in);
        if (top == arr.length-1){
            System.out.println("stack overflow");
        }
        else{
        System.out.println("Enter data :");
            int n = sc.nextInt();
            top = top + 1;
            arr [top] = n;
        }
    }

    void pop(){
        if (top == -1){
            System.out.println("stack underflow");
        }
        else {
            int x = arr[top--];
        }
    }
    void view(){
       if(top==-1)
       {
           System.out.println("stack empty/underflow");
       }
       else
       {
           System.out.println("Stack element...");
           for ( int i=top; i>=0;i--){
               System.out.println(arr[i]);
           }
       }
    }

    public static void main(String[] args) {
        StackExample obj = new StackExample();
        while (true){
            System.out.println("\nPress 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for view");
            System.out.println("press 4 for exit");

            System.out.println("Enter your choice ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    obj.push();
                    break;
                case 2 :
                    obj.pop();
                    break;
                case 3 :
                    obj.view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("wrong choice ");

            }
        }

    }
}
