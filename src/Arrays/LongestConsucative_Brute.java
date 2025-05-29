package Arrays;

public class LongestConsucative_Brute {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1, 104, 103}; // Input array

        int longest = Integer.MIN_VALUE; // To store the length of the longest sequence
        int n = arr.length;

        // Iterate through each element as a potential start of a sequence
        for (int i = 0; i < n; i++) {
            int current_num = arr[i]; // Start of sequence
            int cnt = 1; // Current sequence count starts at 1

            // Keep checking for the next consecutive number in the sequence
            while (linearSearch(current_num + 1, arr) == true) {
                current_num += 1; // Move to next consecutive number
                cnt += 1; // Increment count
            }

            // Update the longest sequence length if current is greater
            longest = Math.max(longest, cnt);
        }

        // Print the result
        System.out.println(longest);
    }

    // Helper method to search for a number in the array (Linear Search)
    public static boolean linearSearch(int key, int[] arr) {
        for (int num : arr) {
            if (key == num) return true; // Key found
        }
        return false; // Key not found
    }
}
