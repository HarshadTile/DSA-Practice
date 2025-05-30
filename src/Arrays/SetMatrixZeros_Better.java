package Arrays;

public class SetMatrixZeros_Better {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        int[][] res = setZeros(matrix);

        // Printing the final modified matrix
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to set entire row and column to 0 if any cell is 0
    public static int[][] setZeros(int[][] matrix2) {

        int n = matrix2.length;        // number of rows
        int m = matrix2[0].length;     // number of columns

        // Arrays to mark rows and columns that need to be zeroed
        int[] row = new int[n];  // initialized to 0 by default
        int[] col = new int[m];  // initialized to 0 by default

        // Step 1: Identify the cells with zero and mark their row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix2[i][j] == 0) {
                    row[i] = 1; // mark row i to be zeroed
                    col[j] = 1; // mark column j to be zeroed
                }
            }
        }

        // Step 2: Traverse matrix again and set cells to 0
        // if either its row or column is marked
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix2[i][j] = 0;
                }
            }
        }

        return matrix2; // return the modified matrix
    }
}
