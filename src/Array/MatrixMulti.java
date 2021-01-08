package Array;
import java.util.*;

public class MatrixMulti {
    public static void maiṇ̣̣̣̣̣̣̣̣(String[] args) {
        Scanner sc = new Scanner(System.in);
    }

    public static void showMatrix (int[][] x) {
        System.out.println("Matrix is: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("%5d", x[i][j]);
            }
        }

    }
    // show the matrix

    public static int[][] inputMatrix (int m, int n, Scanner sc) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        return x;
    }
    // Input matrix

    int[][] matrixMulti(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int p = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    c[i][j] += a[i][p] * b[j][p];
                }
            }
        }
        return c;
    }
}

