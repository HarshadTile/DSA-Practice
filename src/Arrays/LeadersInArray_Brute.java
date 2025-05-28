package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray_Brute {
    public static void main(String[] args) {
        int[] nums = {10,22,12,3,0,6};
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i]<nums[j])
                {
                    leader= false;
                    break;
                }

            }
            if(leader==true){
                ans.add(nums[i]);
            }
        }

        //traversing the list
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
