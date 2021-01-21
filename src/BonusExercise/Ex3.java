package BonusExercise;

import java.util.Scanner;

// Description: Sort elements of array by ascending and descending order
public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of elements in array: ");
        int num = scanner.nextInt();
        int arr[] = new int[num];
        System.out.println("Input elements of array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }


    }
}
