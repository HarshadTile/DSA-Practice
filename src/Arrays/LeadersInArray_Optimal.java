package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray_Optimal {
    public static void main(String[] args) {
        int[] nums = {10,22,12,3,0,6};
        List<Integer> ans = new ArrayList<>();

        int maxi = 0;
        int n = nums.length;

        for (int i = n-1; i >=0; i--) {
            if(nums[i]>maxi){
                ans.add(nums[i]);
                maxi = nums[i];
            }

        }

        //If question expections in sorted manner or reverse
        //a] Collections.reverse();
        //b]create reverse method

       for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
