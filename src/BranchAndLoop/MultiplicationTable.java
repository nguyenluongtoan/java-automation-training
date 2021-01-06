package BranchAndLoop;

import java.util.Scanner;

public class MultiplicationTable {

	public void table() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n : ");
        n = sc.nextInt();
        System.out.println("The multiplication table of:  " + n );
        for (int j = 1; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + (j * n));
        }
        System.out.println("");

    }

    public static void main(String args[]) {
        MultiplicationTable n = new MultiplicationTable();
        n.table();

    }

}
