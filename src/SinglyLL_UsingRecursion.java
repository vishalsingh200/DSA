public class SinglyLL_UsingRecursion {
    void print(Node head){
        if (head == null)
            return;
        System.out.println(head.data+" ");
        print(head.next);


    }
}
