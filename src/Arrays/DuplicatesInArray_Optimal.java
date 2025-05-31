package Arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray_Optimal {

    public static void main(String[] args) {

        int[] nums = {2,5,9,6,9,3,8,9,1,7,1};
        List<Integer> list = new ArrayList<>();

        int slow = nums[0];
        int fast = nums[0];

        do{
            slow = nums[slow];
            fast = nums[nums[fast]];

        }while(slow!=fast);

        slow = nums[0];

        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        list.add(slow);


    }
}
