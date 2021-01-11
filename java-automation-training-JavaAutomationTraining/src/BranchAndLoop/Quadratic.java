package BranchAndLoop;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a(diferent 0): ");
		float a = sc.nextFloat();
		System.out.println("Input b: ");
		float b = sc.nextInt();
		System.out.println("Input c: ");
		float c = sc.nextInt();
		QuadraticEquation(a,b,c);
		
	}
	public static void QuadraticEquation (float a, float b, float c) {
		float delta = (b*b - 4*a*c);
		float x1;
		float x2;
		if (a == 0 ) {
			if (b == 0) {
			System.out.println("No root");
			} else {
				System.out.println("Root is: " + -c/b);
			}
		} 
	
	if (delta < 0) {
	System.out.println("No root ");
		} else if (delta == 0) {
			x1 = (-b/(2*a));
			System.out.println("Root is: x1 = x2 = " + x1);
		} else if(delta > 0) {
			if ((a + b + c) == 0) {
				x2 = c/a;
			System.out.println("Root is: x1 = 1 and x2 = " + x2);
			} else if ((a - b + c) == 0) {
				x2 = -c/a;
				System.out.println("Root is: x1 = -1 and x2 = " + x2);
				}
			x1 = (float)(-b+Math.sqrt(delta)/2*a);
			x2 = (float)(-b-Math.sqrt(delta)/2*a);
			System.out.println("Root is: x1 = " + x1 + " and x2 = " + x2);
		}
	
	
	
	
	}
}
