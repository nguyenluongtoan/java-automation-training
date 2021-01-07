package Array;

import java.util.Scanner;

public class MatrixMinus {
    public static void main(String []args) {
        static int m;
        static int n;
        static int[][] matrixA;
        static int[][] matrixB;
        static int[][] matrixC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows for matrix: ");
        n = sc.nextInt();
        System.out.println("Input number of column for matrix: ");
        m = sc.nextInt();
        matrixA = new int[n][m];
        matrixB = new int[n][m];
        matrixC = new int[n][m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; i <= m; i++) {
                System.out.print("Matrix A: ");
                matrixA[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // input matrix A

        for (int i = 1; i <= n; i++) {
            for (int j = 1; i <= m; i++) {
                System.out.print("Matrix B: ");
                matrixB[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // input matrix B

        for (int i = 1; i <= n; i++) {
            for (int j = 1; i <= m; i++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
            System.out.println();
        }
        // calculate elements of matrix C



    }

}
