package RecursionAndBacktacking;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Optimal {

    // Recursive function to generate all permutations
    private void recusivePermutation(int index, int[] nums, List<List<Integer>> ans) {
        // Base case: if the index reaches the end, add the current permutation to the answer list
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds)); // Add a copy of the current permutation
            return;
        }

        // Iterate through the array and swap elements to form permutations
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums); // Swap current element with the element at the current index
            recusivePermutation(index + 1, nums, ans); // Recurse for the next index
            swap(i, index, nums); // Backtrack to restore original array state
        }
    }

    // Helper function to swap two elements in the array
    public void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    // Function to generate all permutations of the given array
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recusivePermutation(0, nums, ans); // Start recursion from index 0
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Input array

        Permutation_Optimal optimal = new Permutation_Optimal();
        List<List<Integer>> res = optimal.permute(nums); // Get all permutations

        // Print all permutations
        for (List<Integer> num : res) {
            System.out.println(num);
        }
    }

}
