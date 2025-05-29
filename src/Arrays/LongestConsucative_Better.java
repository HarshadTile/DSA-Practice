package Arrays;

import java.util.Arrays;

public class LongestConsucative_Better {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1, 104, 103}; // Input array

        int cnt = 0; // Count of current consecutive sequence
        int lastsmaller = Integer.MIN_VALUE; // To track the previous number in sequence
        int n = arr.length;
        int longest = 0; // To store the length of the longest consecutive sequence

        Arrays.sort(arr); // Sort the array to bring consecutive numbers together

        // Traverse the sorted array
        for (int i = 0; i < n; i++) {
            // If current number continues the sequence
            if (arr[i] - 1 == lastsmaller) {
                cnt++; // Increment the count
                lastsmaller = arr[i]; // Update the last number in sequence
            }
            // If current number is duplicate, skip without resetting the count
            else if (lastsmaller != arr[i]) {
                cnt = 1; // Reset count for a new sequence
                lastsmaller = arr[i]; // Update the last number
            }

            // Update the longest length found so far
            longest = Math.max(longest, cnt);
        }

        // Output the length of the longest consecutive sequence
        System.out.println(longest);
    }
}
