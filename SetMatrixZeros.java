import java.util.Arrays;

public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        // check first row and col
        boolean row = false;
        boolean col = false;
        for (int r = matrix.length-1; r >= 0; r--) {
            if (matrix[r][0] == 0) {
                row = true;
                break;
            }
        }
        for (int c = matrix[0].length-1; c >= 0; c--) {
            if (matrix[0][c] == 0) {
                col = true;
                break;
            }
        }
        // mark rows and cols
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        // zero rows
        for (int r = matrix.length-1; r > 0; r--) {
            if (matrix[r][0] == 0) {
                for (int c = matrix[0].length-1; c > 0; c--) {
                    matrix[r][c] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        // zero cols
        for (int c = matrix[0].length-1; c > 0; c--) {
            if (matrix[0][c] == 0) {
                for (int r = matrix.length-1; r > 0; r--) {
                    matrix[r][c] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        // System.out.println(col);
        if (row) {
            for (int r = matrix.length-1; r >= 0; r--) {
                matrix[r][0] = 0;
            }
        }
        if (col) {
            for (int c = matrix[0].length-1; c >= 0; c--) {
                matrix[0][c] = 0;
            }
        }
    }    
}
