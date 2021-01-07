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
    }
}
