import java.util.*;
public class Two_sum {
    public static int[] twoSum(int []nums, int target){
        int [] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i],i);
            }
            else{
                ans[1] = i;
                ans[0] = map.get(target - nums[i]);//
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;
        for(int x : twoSum(nums , target))
            System.out.print(x + " ");
    }
}
