import java.util.Scanner;
public class Linear_Search_Sored
{
    public static void main(String[] args)
    {
        int count=0;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("number of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");

        for ( i =0; i< n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter item to find:");

        int item = sc.nextInt();
        for ( i =0; i<n; i++)
        {
            if (arr[i]==item)
            {
                count++;
                break;
            }
        }
        if (count > 0)
        {
            System.out.println("items are found:" + " "+ i);
        }
        else
        {
            System.out.println("item are not found");
        }
    }
}
