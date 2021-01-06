package BranchAndLoop;

import java.util.Scanner;

public class Compare3intergers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number: ");
		int a = sc.nextInt();
		System.out.println("Second number: ");
		int b = sc.nextInt();
		System.out.println("Third number: ");
		int c = sc.nextInt();
		if (a >= b && a >= c) {
			System.out.println("Max number is: " + a);
			
		}
		else if (b >= c) {
			System.out.println("Max number is: " + b);
		}
		else 
			System.out.println("Max number is: " + c);
		
	
	}
}
