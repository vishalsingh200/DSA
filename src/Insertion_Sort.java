//INSERTION SHORT
import java.util.Scanner;
public class Selection_Sort {
    public static void main(String[] args)
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("number of element u want enter");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements ");

        for (int i = 0; i < n; i++)
        {
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i<n-1; i++)
        {
            int loction = i;
            for (int j = i+1; j<n ; j++)
            {
               if(arr[j] < arr[loction])
               {
                   loction = j;
               }
            }
            temp = arr[i];
            arr[i] = arr[loction];
            arr[loction] = temp;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println("sorted elements are: " + arr[i]);
        }

    }
}
