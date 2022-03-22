public class InsertionSort_1 {
    public void insertion(int arr[] ){
        int key;
        int n = arr.length;
        for (int i = 1; i<n ;i++){
            key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
    }
    public static void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[])
    {
        int arr[] = {5,3,1,4,2};

        InsertionSort_1 ob = new InsertionSort_1();
        ob.insertion(arr);

        print(arr);
    }

}
