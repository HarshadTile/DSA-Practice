package Arrays;

public class RearrangeElementBySign_Brute {
    public static void main(String[] args) {
        // Input array containing both positive and negative numbers
        int[] arr = {3, 1, -2, -5, 2, -4};
        int n = arr.length;

        // Arrays to store positive and negative elements separately
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        // Index pointers for pos and neg arrays
        int posIndex = 0;
        int negIndex = 0;

        // Separate the positive and negative elements from the original array
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[posIndex++] = arr[i]; // Add to pos array if element is positive
            } else {
                neg[negIndex++] = arr[i]; // Add to neg array if element is negative
            }
        }

        // Reset indexes to reuse them in next loop
        posIndex = 0;
        negIndex = 0;

        // Result array to store the rearranged elements
        int[] result = new int[n];

        // Fill result array by alternating positive and negative elements
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = pos[posIndex++]; // Even index: add from positive array
            } else {
                result[i] = neg[negIndex++]; // Odd index: add from negative array
            }
        }

        // Print the rearranged array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
