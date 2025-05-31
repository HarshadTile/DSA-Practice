package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesInArray_Brute {

    public static void main(String[] args) {
        int[] nums = {1,3,4,4,4,4,2,2};
        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1] && !ans.contains(nums[i]))
            {
                ans.add(nums[i]);
            }
        }

        for(int num : ans){
            System.out.print(num+" ");
        }


    }
}
