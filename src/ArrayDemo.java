import java.lang.reflect.Array;
public class ArrayDemo {
    int arr[];
    public ArrayDemo()
    {
        arr = new int[5];
        for (int i = 0; i< arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void traverse()
    {
        for (int res: arr){
            System.out.println(res);
        }
    }
    public void insert (int index, int value)
    {
        if (arr[index]==Integer.MIN_VALUE)
        {
            arr[index]=value;
        }
        else
        {
            System.out.println("already filled");
        }
    }
    public void getvalue(int index)
    {
        try
        {
            System.out.println(arr[index]);
        }
            catch (ArrayIndexOutOfBoundsException obj)
            {
                System.out.println("invalid index");
            }
    }
    public void search(int value)
    {
        for (int i=0; i<arr.length; i++){
            if (arr[i]==value)
            {
                System.out.println("value found");
                return;
            }
        }
        System.out.println("value not found");
    }
    public void deletearray()
    {
        arr = null;
    }
}
class ArrayTest{
    public static void main(String[] args) {
        ArrayDemo obj = new ArrayDemo();
        try{
            obj.traverse();
            obj.insert(2,56);
        }
        catch (ArrayIndexOutOfBoundsException obj1)
        {
            System.out.println("invalid index");
        }
    }
}
