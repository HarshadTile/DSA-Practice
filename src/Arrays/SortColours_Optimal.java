package Arrays;

public class SortColours_Optimal {

    public static void main(String[] args) {

        // Input array containing only 0s, 1s, and 2s
        int[] nums = {0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 0, 0, 0};
        int n = nums.length;

        // Initialize three pointers
        int low = 0;        // Points to the beginning of the array (boundary for 0s)
        int mid = 0;        // Current element to process
        int high = n - 1;   // Points to the end of the array (boundary for 2s)

        // Traverse the array using Dutch National Flag algorithm
        while (mid <= high) {
            if (nums[mid] == 0) {
                // If current element is 0, swap it with the element at 'low'
                // Move both 'low' and 'mid' forward
                swap(low, mid, nums);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If current element is 1, it's already in the correct place
                // Just move 'mid' forward
                mid++;
            } else {
                // If current element is 2, swap it with the element at 'high'
                // Move 'high' backward only (mid stays the same for rechecking the swapped value)
                swap(high, mid, nums);
                high--;
            }
        }

        // Print the sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Swap function to exchange elements at two given indices in the array
    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
