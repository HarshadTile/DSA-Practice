package RecursionAndBacktacking;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Brute {

    // Recursive function to generate all permutations using extra space (boolean array)
    private void recursivePermutation(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        // Base case: if the current permutation is complete, add it to the result
        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds)); // Add a deep copy of the current list
            return;
        }

        // Try placing each unused element in the current position
        for (int i = 0; i < nums.length; i++) {
            if(!freq[i]) { // If the number at index i is not used yet
                freq[i] = true; // Mark it as used
                ds.add(nums[i]); // Add it to the current permutation
                recursivePermutation(nums, ds, ans, freq); // Recurse for the next position
                ds.remove(ds.size() - 1); // Backtrack: remove last element
                freq[i] = false; // Unmark the number as used
            }
        }
    }

    // Function to start generating permutations
    public List<List<Integer>> funPermutation(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>(); // To store final permutations
        List<Integer> ds = new ArrayList<>(); // To build a single permutation
        boolean[] freq = new boolean[n]; // To keep track of used elements

        recursivePermutation(nums, ds, ans, freq); // Start recursion
        return ans;
    }

    public static void main(String[] args) {
        Permutation_Brute permutationBrute = new Permutation_Brute();
        int[] nums = {1, 2, 3}; // Input array

        List<List<Integer>> ans = permutationBrute.funPermutation(nums); // Generate permutations

        // Print each permutation
        for(List<Integer> num : ans) {
            System.out.println(num);
        }
    }
}
