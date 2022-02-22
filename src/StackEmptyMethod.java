import java.util.Stack;
public class StackEmptyMethod {
    public static void main(String[] args) {
        Stack obj = new Stack();

        obj.push(1);               //push
        obj.push(23);
        obj.push(43);
        obj.push(34);
        obj.push(98);
        System.out.println("Stack-->"+obj);

        int element = (int) obj.pop();   //pop
        System.out.println("Remove from stack:"+element);

        int element1= (int) obj.peek();  //peek
        System.out.println("top element:"+ element1);

        boolean result = obj.empty();    //empty
        System.out.println("Is the stack empty? " + result);



    }

}
