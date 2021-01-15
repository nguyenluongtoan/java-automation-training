package ClassAndObject;

import java.util.Scanner;

public class Matrix {
    public int row;
    public int column;

    public int[][] inputMatrix(int m, int n, Scanner scanner) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }
}
