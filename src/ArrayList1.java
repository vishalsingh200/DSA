import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        int index = 1;
        int i = 0;
        for (i = index; i< arr.length-1; i++)
        {
            arr [i] = arr[i+1];
        }
        arr[i] = 0;
        for (int i1=0; i1< arr.length; i1++)
        {
            System.out.println(arr[i1]);
        }
    }
}


