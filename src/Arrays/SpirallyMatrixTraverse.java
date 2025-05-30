package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpirallyMatrixTraverse {

    // Method to return a list of integers representing the spiral traversal
    public static List<Integer> traverseMatrix(int[][] matrix) {

        int n = matrix.length;         // number of rows
        int m = matrix[0].length;      // number of columns

        int left = 0;                  // initialize left boundary
        int right = m - 1;             // initialize right boundary
        int top = 0;                   // initialize top boundary
        int bottom = n - 1;            // initialize bottom boundary

        List<Integer> list = new ArrayList<>(); // to store result

        // Continue the loop until boundaries overlap
        while (left <= right && top <= bottom) {

            // Traverse top row from left to right
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++; // move top boundary down

            // Traverse right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--; // move right boundary left

            // Traverse bottom row from right to left, if still within bounds
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--; // move bottom boundary up
            }

            // Traverse left column from bottom to top, if still within bounds
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++; // move left boundary right
            }
        }

        return list; // return spiral traversal
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6},
                {20, 21, 22, 23, 24, 7},
                {19, 32, 33, 34, 25, 8},
                {18, 31, 36, 35, 26, 9},
                {17, 30, 29, 28, 27, 10},
                {16, 15, 14, 13, 12, 11}
        };

        // Call the function to get spiral order
        List<Integer> res = traverseMatrix(matrix);

        // Print the result
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
