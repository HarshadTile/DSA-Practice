package Arrays;

import java.util.HashMap;

public class TwoSum_Brute {
    public static int[] findTwoSum(int[]nums,int target){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
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
