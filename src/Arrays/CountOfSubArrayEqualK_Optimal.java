package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubArrayEqualK_Optimal {

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 1, 2, 3, 2, 1}; // Input array
        int k = 3;                                // Target sum

        // HashMap to store prefix sums and their frequency
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize with sum 0 having one occurrence (empty subarray)

        int sum = 0;    // Running prefix sum
        int remain;     // Stores (current sum - k)
        int cnt = 0;    // Count of subarrays with sum == k

        // Traverse the array
        for (int num : nums) {
            sum += num;            // Update running sum
            remain = sum - k;      // Check if there's a prefix sum that satisfies (sum - k)

            // If such prefix sum exists in map, add its frequency to count
            cnt += map.getOrDefault(remain, 0);

            // Update frequency of current prefix sum in map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        // Output the final count
        System.out.println(cnt);
    }
}
