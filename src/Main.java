import java.util.ArrayList;
public class Main {
    public static ArrayList<Integer> duplicate(int arr[]) {
        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(arr[0]);
        int count = 1;
        for(int i=1; i<arr.length; i++)
        {
            if (arr[i]!=arr[i-1])
            {
                obj1.add(arr[i]);
                count++;
            }
        }
        return obj1;
    }

    public static void main(String[] args) {
        int arr[]={10,10,30,30,40,50,50,50,9,45};
        ArrayList<Integer>res = duplicate(arr);
        System.out.println(res);
    }
}
