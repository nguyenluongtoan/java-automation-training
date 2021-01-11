package Array;
import java.util.Scanner;

public class Prob5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }


        System.out.println("The max value in array: " + max);

    }

}
