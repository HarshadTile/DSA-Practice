package Arrays;  // Package declaration

public class SortColours_Brute {  // Class declaration

    public static void main(String[] args) {  // Main method - program entry point
        int[] nums = {0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 0, 0, 0};  // Input array containing 0s, 1s, and 2s
        int cnt0 = 0;  // Counter for number of 0s
        int cnt1 = 0;  // Counter for number of 1s
        int cnt2 = 0;  // Counter for number of 2s

        // Loop through the array to count how many 0s, 1s, and 2s are present
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt0++;  // Increment count of 0s
            } else if (nums[i] == 1) {
                cnt1++;  // Increment count of 1s
            } else {
                cnt2++;  // Increment count of 2s
            }
        }

        // Overwrite the array with cnt0 number of 0s at the start
        for (int i = 0; i < cnt0; i++) {
            nums[i] = 0;
        }

        // Fill the next cnt1 positions with 1s
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            nums[i] = 1;
        }

        // Fill the remaining positions with 2s
        for (int i = cnt0 + cnt1; i < nums.length; i++) {
            nums[i] = 2;
        }

        // Print the sorted array after rearranging 0s, 1s, and 2s
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
