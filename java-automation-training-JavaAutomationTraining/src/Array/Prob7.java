package Array;
import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if ( arr[i] < min) {
                min = arr[i];
            }
        }


        System.out.println("The min value in array: " + min);


    }
}
