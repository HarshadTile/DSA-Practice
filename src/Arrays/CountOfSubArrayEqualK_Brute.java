package Arrays;

public class CountOfSubArrayEqualK_Brute {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1}; // Input array
        int k = 3;                   // Target sum
        int sum = 0;                 // Variable to hold the sum of subarrays
        int cnt = 0;                 // Counter to count subarrays with sum == k

        // Outer loop: start index of subarray
        for (int i = 0; i < arr.length; i++) {
            // Middle loop: end index of subarray
            for (int j = i; j < arr.length; j++) {
                sum = 0; // Reset sum for every new subarray from i to j

                // Inner loop: calculate sum of subarray from i to j
                for (int m = i; m <= j; m++) {
                    sum += arr[m]; // Add each element from i to j
                }

                // If sum matches k, increment the count
                if (sum == k) {
                    cnt++;
                }
            }
        }

        // Output the final count of subarrays
        System.out.println(cnt);
    }
}
