public class SumOfAllElements {
    static  int sum(int arr[], int n){
        if (n<=0){
            return 0;
        }
        return (sum(arr,n-1)+ arr[n-1]);
    }

    public static void main(String[] args) {
        int arr1 [] = {1,2,3};
        System.out.println(sum(arr1,arr1.length));
    }
}
