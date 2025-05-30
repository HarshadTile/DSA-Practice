package Arrays;

public class SetMatrixZeros_Brute {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };

        int[][] res = setMatrix(matrix);

        // Print the result matrix
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Brute-force function to set matrix zeroes
    public static int[][] setMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Traverse and mark cells that need to be set to zero
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If current cell is 0, mark its entire row and column with -1 (temporary marker)
                if (matrix[i][j] == 0) {
                    markRow(i, matrix);
                    markCol(j, matrix);
                }
            }
        }

        // Step 2: Convert all -1s to 0 (final zeroing step)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    // Mark all non-zero elements in the row as -1
    public static void markRow(int i, int[][] matrix) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1; // Temporary marker
            }
        }
    }

    // Mark all non-zero elements in the column as -1
    public static void markCol(int j, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1; // Temporary marker
            }
        }
    }
}
