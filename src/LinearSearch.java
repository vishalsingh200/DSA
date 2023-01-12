

public class LinearSearch {
    public static int linera(int [] arr, int currInd, int tar){
        if (currInd == arr.length)
            return -1;
        if (arr[currInd] == tar)
            return currInd;
        return linera(arr,currInd+1,tar);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(linera(arr,0,3));
    }
}
