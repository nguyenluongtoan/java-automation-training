package BranchAndLoop;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a: ");
		int a = sc.nextInt();
		System.out.println("Input b: ");
		int b = sc.nextInt();
		System.out.println("Before swapping a = " + a + " and b = " + b);
		int c = b;
		b = a;
		a = c;
		System.out.println("After swapping a = " + a + " and b = " + b);
	}

}
