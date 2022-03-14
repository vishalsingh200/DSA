import java.util.Scanner;
public class Insertion_SORT {
    public static void main(String[] args) {
        int j;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of element : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Elements are :");

        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<n-1; i++)
        {
            temp = arr[i];
            j=i-1;
            while (temp<arr[j] && j>-1 )
            {
                arr[j+1] = arr[j];
                j =  j-1;
            }
            arr[j+1] = temp;
        }
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
