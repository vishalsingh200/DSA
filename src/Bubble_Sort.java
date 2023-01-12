import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of element enter:");

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i<arr.length ; i++){
            System.out.println("Elements are:"+arr[i]);
        }
    }
}
