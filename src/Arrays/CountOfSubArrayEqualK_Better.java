package Arrays;

public class CountOfSubArrayEqualK_Better {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1}; // Input array
        int k = 3;                   // Target sum
        int sum = 0;                 // To store sum of subarrays
        int cnt = 0;                 // To count subarrays with sum equal to k

        // Outer loop: pick starting index of subarray
        for (int i = 0; i < arr.length; i++) {

            // Initialize sum for each new subarray starting at index i
            sum = 0;

            // Inner loop: pick ending index of subarray
            for (int j = i; j < arr.length; j++) {
                sum += arr[j]; // Add current element to the running sum

                // If sum equals k, increment the counter
                if (sum == k) {
                    cnt++;
                }
            }
        }

        // Print the total count of valid subarrays
        System.out.println(cnt);
    }
}
