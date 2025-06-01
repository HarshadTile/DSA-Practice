package Arrays;

public class RearrangeElementBySign_Better {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int n = arr.length;

        // Arrays to store positive and negative elements separately
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        // Index pointers for pos and neg arrays
        int posIndex = 0;
        int negIndex = 0;

        // Step 1: Separate positive and negative numbers into pos[] and neg[]
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[posIndex++] = arr[i]; // Store positive number
            } else {
                neg[negIndex++] = arr[i]; // Store negative number
            }
        }

        // Step 2: Reset indexes to use for rearrangement
        posIndex = 0;
        negIndex = 0;

        // Result array to store alternated positive and negative numbers
        int[] result = new int[n];

        // Step 3: Place elements in alternate positions
        // i ranges from 0 to n/2 - 1, because pos and neg arrays are of size n/2
        for (int i = 0; i < n / 2; i++) {
            result[i * 2] = pos[posIndex++];     // Even indices → positive numbers
            result[i * 2 + 1] = neg[negIndex++]; // Odd indices → negative numbers
        }

        // Step 4: Print the final rearranged array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
