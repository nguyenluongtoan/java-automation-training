package Array;

import java.util.Scanner;

public class MatrixMinus {
    public static void main(String []args) {
        static int m;
        static int n;
        static int[][] matrix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows for matrix: ");
        n = sc.nextInt();
        System.out.println("Input number of column for matrix: ");
        m = sc.nextInt();
        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < m; i++) {
                System.out.print("Matrix A: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // input matrix A

    }

}
