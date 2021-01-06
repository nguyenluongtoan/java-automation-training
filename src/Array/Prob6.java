package Array;
import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        // create an array with n elements

        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            arr[i] = sc.nextInt();
        }
        // input elements of array

        int max = arr[0];
        int max2 = 0;

        for (int i = 1; i < n; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }
        // Find max value of array

        for(int i = 0; i < n; i++){
            if(max == arr[i])
            {
                continue;
            }
            else if(max2 < arr[i]){
                max2 = arr[i];
            }
        }
        // find second max value of array


        System.out.println("The second max value in array: " + max2);

    }
}
