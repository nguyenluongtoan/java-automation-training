package Array;
import java.util.Scanner;

public class MatrixMulti {
    public static void main(String []args) {
        int m,n,k;
        int [][] a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows for matrix A: ");
        m = sc.nextInt();
        System.out.println("Input number of colums for matrix A: ");
        n = sc.nextInt();
        System.out.println("Input number of colums for matrix B: ");
        k = sc.nextInt();
        System.out.println("Input matrix A: ");
        a = inputMatrix(m,n,sc);
        System.out.println("Input matrix B: ");
        b = inputMatrix(n,k,sc);
        System.out.println("Matrix A:");
        showMatrix(a);
        System.out.println("Matrix B:");
        showMatrix(b);
        System.out.println("Multiple matrix: ");
        c = matrixMulti(a,b);
        showMatrix(c);
    }

    public static void showMatrix (int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
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

    public static int[][] matrixMulti(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int p = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    c[i][j] += a[i][k] * b[j][k];
                }
            }
        }
        return c;
    }
}

