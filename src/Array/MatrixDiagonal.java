package Array;

import java.util.Scanner;

public class MatrixDiagonal {
    public static void main(String []args) {
        int sum = 0;
        int n;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input degree of matrix: ");
        n = sc.nextInt();

        matrix = new int[n][n];
        System.out.println("Input matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A["+i+","+j+"] ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // input matrix

        System.out.println("Matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                System.out.println();
            }
        }
        System.out.println("Sum of diagonal ia: " + sum);
    }
}
