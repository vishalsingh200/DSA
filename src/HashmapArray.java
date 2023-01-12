import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class HashmapArray {
        public static void main(String[] args) {
            int arr[] = {2,4,2,4,2,5,7,2,1,2,6,2,3,6,7};
            HashSet<Integer> set = new HashSet<>();
            List<Integer> ansList = new ArrayList<>() ;

            for (int i = 0; i<arr.length; i++) {

                if (set.contains(arr[i])){
                    ansList.add(arr[i]);
                }
                else{
                    set.add(arr[i]);
                }
            }
            System.out.println(set);
        }

    }

