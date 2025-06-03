package Arrays;

import java.util.HashMap;

public class TwoSum_Optimal {
    public static int[] findTwoSum(int[]nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        int num = 0;
        int remain = 0;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            remain = target - num;

            if(map.containsKey(remain)){
                return new int[] {map.get(remain),i};
            }
            map.put(num,i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 14;
        int[] res = findTwoSum(nums,target);

        for(int it:res){
            System.out.print(it+" ");
        }
    }
}
