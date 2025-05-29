package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray_Optimal {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6}; // Input array
        List<Integer> ans = new ArrayList<>(); // List to store leader elements

        int maxi = 0; // To track the maximum element from the right
        int n = nums.length;

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If current element is greater than the maximum seen so far, it's a leader
            if (nums[i] > maxi) {
                ans.add(nums[i]); // Add the leader to the result list
                maxi = nums[i];   // Update the maximum
            }
        }

        // If the problem requires the leaders in original (left to right) order:
        // Option a: Use Collections.reverse(ans);
        // Option b: Create a custom reverse method

        // Print the leaders
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
