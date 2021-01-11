package Array;
import java.util.Scanner;


public class MagicSquare {
    public static void main(String[] args) {
        int i, j;
        int sum_row, sum_col, sum_diagonal = 0, sum = 0;
        boolean magic=true;
        int[][] square = new int[3][3];
        Scanner input = new Scanner(System.in);

        //Read number for each cell
        System.out.println("Enterers --> ");
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
                square[i][j] = input.nextInt();

        //Display square
        System.out.println("Square;");
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++)
                System.out.print(square[i][j] + " ");
            System.out.println();
        }


    }
}
