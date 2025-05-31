package Arrays;

public class MaximumSubArray_Brute {
    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};  // Input array
        int n = nums.length;                       // Length of the array
        int sum = 0;                               // Variable to store subarray sum
        int maxi = Integer.MIN_VALUE;              // Variable to store maximum subarray sum (initialized to smallest value)

        // Outer loop - starting index of subarray
        for (int i = 0; i < n ; i++) {
            // Middle loop - end index of subarray (inclusive)
            for (int j = i; j < n; j++) {
                sum = 0; // Reset sum for each subarray starting from i and ending at or after j

                // Inner loop - calculate sum from index j to end of array
                for (int k = j; k < n ; k++) {
                    sum += nums[k]; // Add current element to sum
                    maxi = Math.max(maxi, sum); // Update maximum if current sum is greater

                    // Debug print to show progress of the loops and current sum
//                    System.out.println("i: " + i + ", j: " + j + ", k: " + k + ", sum: " + sum);
                }
            }
        }

        // Print the maximum subarray sum found
        System.out.print("Maximum sub array sum: " + maxi);
    }
}
