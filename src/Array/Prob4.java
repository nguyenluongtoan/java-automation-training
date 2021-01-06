package Array;
import java.util.Scanner;

public class Prob4 {
    public static void main(String[] args) {
        float temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            temp += arr[i];
        }
        System.out.println("The average value of elements in array: " + temp/n);

    }
}
