package BranchAndLoop;
import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int num = sc.nextInt();
		if(num %2  == 0) {
			System.out.println("The number is even ");
		} else {
			System.out.println("The number is odd ");
		}
		

	}

}
