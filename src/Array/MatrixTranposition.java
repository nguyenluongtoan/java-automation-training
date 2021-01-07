package Array;

import java.util.Scanner;

public class MatrixTranposition {
    public static void main (String []args) {
        int n,m;
        int matrix[][];
        int transMatrix[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows in matrix: ");
        n = sc.nextInt();
        System.out.println("Input number of colums in matrix: ");
        m = sc.nextInt();
        matrix = new int[n][m];
        transMatrix = new int[m][n];

        System.out.println("Input matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("A["+i+"]["+j+"]: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // Input elements of matrix

    }
}
