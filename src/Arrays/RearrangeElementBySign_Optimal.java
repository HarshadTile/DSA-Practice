package Arrays;

public class RearrangeElementBySign_Optimal {

    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int n = arr.length;

        // Create a result array to store elements in rearranged form
        int[] ans = new int[n];

        // Initialize position pointers
        // posIndex → even indices (0, 2, 4, ...) for positive numbers
        // negIndex → odd indices (1, 3, 5, ...) for negative numbers
        int posIndex = 0;
        int negIndex = 1;

        // Traverse the original array and place elements at correct indices
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                // Place negative numbers at odd indices
                ans[negIndex] = arr[i];
                negIndex += 2; // Move to next odd index
            } else {
                // Place positive numbers at even indices
                ans[posIndex] = arr[i];
                posIndex += 2; // Move to next even index
            }
        }

        // Print the rearranged array
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
