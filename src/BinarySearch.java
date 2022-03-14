public class BinarySearch {
    int binary(int arr[], int l, int r, int x){
        if (r >=1){
            int mid = 1 + (r-1)/2;
            if (arr[mid]==x)
                return mid;
            if (arr[mid]>x)
                return binary(arr,l,mid-1,x);
            return binary(arr,mid+1,r,x);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch obj1 = new BinarySearch();
        int  arr [] = {2,3,5,6,10};
        int n = arr.length;
        int x = 5;
        int res = obj1.binary(arr,0,n-1,x);
        if (res == -1)
            System.out.println("Element is not present");

        else
            System.out.println("Element is present at index "+" "+ res);

    }
}
