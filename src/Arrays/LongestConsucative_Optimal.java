package Arrays;

import java.util.HashSet;

public class LongestConsucative_Optimal {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1, 104, 103}; // Input array
        int n = arr.length;

        HashSet<Integer> set = new HashSet<>(); // To store unique elements
        int longest = 0;
        int cnt = 0;

        // Add all elements to the HashSet (duplicates automatically removed)
        for (int num : arr) {
            set.add(num);
        }

        // Print elements in the set (for debugging or verification)
        for (int num : set) {
            System.out.print(num + " ");
        }

//        int res = findLConsucative(arr, n);
//        System.out.println(res);
    }

    // Method to find the length of the longest consecutive sequence
    public static int findLConsucative(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        int cnt = 0;

        // Add all elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Iterate through the set
        for (int num : set) {
            // Check if current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int current_num = num;
                cnt = 1;

                // Count the length of the consecutive sequence
                while (set.contains(current_num + 1)) {
                    current_num += 1;
                    cnt += 1;
                }

                // Update the maximum sequence length
                longest = Math.max(longest, cnt);
            }
        }

        // Return the result
        return longest;
    }
}
