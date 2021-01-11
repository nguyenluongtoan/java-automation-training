package Array;

import java.util.Scanner;

public class MatrixInverse {
    public static void main (String []args) {
        int n;
        int matrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input degree of square matrix: ");
        n = sc.nextInt();
        matrix = new int[n][n];

        System.out.println("Input matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A["+i+"]["+j+"]: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // Input elements of matrix
    }

}
