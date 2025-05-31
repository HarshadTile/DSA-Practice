package Arrays;  // Package declaration

public class MaximumSubArray_Optimal {  // Class declaration

    public static void main(String[] args) {  // Main method - entry point of the program
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};  // Input array
        int sum = 0;  // Current subarray sum
        int maxi = Integer.MIN_VALUE;  // Maximum subarray sum initialized to smallest integer
        int start = 0;  // Start index of the current subarray being considered
        int ansStart = 0;  // Start index of the maximum subarray found so far
        int ansEnd = 0;  // End index of the maximum subarray found so far

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {

            // If sum is zero, set start to current index i (potential new subarray start)
            if (sum == 0) start = i;

            sum += nums[i];  // Add current element to current sum

            // If current sum is greater than max found so far, update maxi and subarray boundaries
            if (sum > maxi) {
                maxi = sum;  // Update maximum sum
                ansStart = start;  // Update start index of max subarray
                ansEnd = i;  // Update end index of max subarray
            }
            // If current sum drops below zero, reset it to zero to start fresh subarray later
            else if (sum < 0) {
                sum = 0;
            }
        }

        // Print the elements of the maximum subarray using the recorded start and end indices
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();  // Print a newline for clarity
        // Print the maximum subarray sum found
        System.out.println("max subarray count is " + maxi);
    }
}

// Explanation:
// The if condition in the loop helps to track the start index of the current subarray.
// The variables ansStart and ansEnd store the boundaries of the subarray with the maximum sum found.
// This way, we can not only find the max sum but also print the actual subarray elements.
