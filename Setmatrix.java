import java.io.*;
import java.util.* ;

public class Setmatrix {
    public static void setZeros(int matrix[][]) {
        // Write your code here..

        int n = matrix.length, m = matrix[0].length;
    boolean[] row = new boolean[n], col = new boolean[m];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (row[i] || col[j]) {
                matrix[i][j] = 0;
            }
        }
    }

    }
}

    