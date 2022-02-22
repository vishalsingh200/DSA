import java.util.Scanner;

public class AnotherMain
{
    static int arr[];

    public static void main(String[] args) {
       arr = new int[5];

        for (int i = 0; i<arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
            System.out.println(arr[i]);
        }

    }
}
