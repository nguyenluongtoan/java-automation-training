package Array;

import java.util.Scanner;

public class MatrixMinus {
    public static void main(String []args) {
        int n,m;
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows for matrix: ");
        n = sc.nextInt();
        System.out.println("Input number of columns for matrix: ");
        m = sc.nextInt();
        matrixA = new int[n][m];
        matrixB = new int[n][m];
        matrixC = new int[n][m];
        System.out.println("Matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A["+i+","+j+"] ");
                matrixA[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // input matrix A

        System.out.println("Matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("B["+i+","+j+"] ");
                matrixB[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // input matrix B

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
            System.out.println();
        }
        // calculate elements of matrix C

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }

    }

}
