public class Merge_Sort
{

    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];


        for (int i = 0; i < n1; ++i)
            arr1[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            arr2[j] = arr[m + 1 + j];



        int i = 0, j = 0;


        int k = l;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m =l+ (r-l)/2;


            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void print(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {2,6,1,5,3,4};

        Merge_Sort ob = new Merge_Sort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array");
        print(arr);
    }
}
