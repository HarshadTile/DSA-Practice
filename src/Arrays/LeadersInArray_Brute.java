package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray_Brute {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6}; // Input array
        List<Integer> ans = new ArrayList<>(); // List to store leader elements

        // Outer loop to pick each element
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true; // Assume current element is a leader

            // Inner loop to compare with elements to its right
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) { // If any element to the right is greater
                    leader = false; // Then current element is not a leader
                    break; // Exit the inner loop early
                }
            }

            if (leader == true) { // If it remained a leader after inner loop
                ans.add(nums[i]); // Add it to the result list
            }
        }

        // Traversing and printing the leader elements
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
