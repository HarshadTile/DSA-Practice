package Arrays;  // Package declaration

public class MaximumSubArray_Better {  // Class declaration

    public static void main(String[] args) {  // Main method - program entry point
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};  // Input array of integers
        int n = nums.length;  // Length of the array
        int sum = 0;  // Variable to store sum of current subarray
        int maxi = Integer.MIN_VALUE;  // Initialize maximum subarray sum to smallest possible integer

        // Outer loop to pick starting index of subarray
        for (int i = 0; i < n; i++) {
            sum = 0;  // Reset sum to 0 for new starting index i

            // Inner loop to pick ending index of subarray starting at i
            for (int j = i; j < n; j++) {
                sum += nums[j];  // Add current element nums[j] to sum
                maxi = Math.max(maxi, sum);  // Update maxi if current sum is greater than maxi
            }
        }

        // Print the maximum sum of any subarray found
        System.out.print("Maximum sub array sum: " + maxi);
    }
}
