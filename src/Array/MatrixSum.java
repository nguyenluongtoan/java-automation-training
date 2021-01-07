package Array;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String []args) {
        int sum = 0;
        int n,m;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows in matrix: ");
        n = sc.nextInt();
        System.out.println("Input number of rows in matrix: ");
        m = sc.nextInt();
        matrix = new int[n][m];
        System.out.println("Input matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("A["+i+"] ["+j+"] ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        //Input matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        // Calculate sum of elements in matrix

        System.out.println("Sum of all elements in matrix: " + sum);
    }
}
