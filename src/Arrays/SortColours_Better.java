package Arrays;  // Package declaration

public class SortColours_Better {  // Class declaration

    public static void main(String[] args) {  // Main method - entry point of the program
        int[] nums = {0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 0, 0, 0};  // Input array of 0s, 1s, and 2s

        int cnt0 = 0;  // Counter for number of 0s
        int cnt1 = 0;  // Counter for number of 1s
        int cnt2 = 0;  // Counter for number of 2s

        // First pass: Count the number of 0s, 1s, and 2s in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt0++;  // Increment count of 0s
            } else if (nums[i] == 1) {
                cnt1++;  // Increment count of 1s
            } else {
                cnt2++;  // Increment count of 2s
            }
        }

        // Second pass: Overwrite array based on counts
        for (int i = 0; i < nums.length; i++) {
            if (i < cnt0) {
                nums[i] = 0;  // Fill with 0s up to cnt0
            } else if (i >= cnt0 && i < cnt0 + cnt1) {
                nums[i] = 1;  // Fill with 1s after 0s
            } else {
                nums[i] = 2;  // Fill the rest with 2s
            }
        }

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
