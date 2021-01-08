package Array;

public class MatrixMulti {
    public static void maiṇ̣̣̣̣̣̣̣̣(String[] args) {

    }

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

