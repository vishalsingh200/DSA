import java.util.Scanner;
public class BubbleSort {
    void bubble(int arr[]){
        int n = arr.length;
        for (int i =0; i<n-1; i++){
            for (int j= 0; j<n-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void traverse(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {2,4,3,6,5};
        obj.bubble(arr);
        obj.traverse(arr);
    }
}
