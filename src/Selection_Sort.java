public class Selection_Sort {
    void slectionSort(int arr[])
    {
        int n = arr.length;


        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;


            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    void traverse(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]+" ");
        System.out.println();
    }


    public static void main(String args[])
    {
        Selection_Sort ob = new Selection_Sort();
        int arr[] = {5,3,4,1,2};
        ob.slectionSort(arr);
        System.out.println("Sorted array");
        ob.traverse(arr);
    }
}


