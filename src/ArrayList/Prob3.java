package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob3 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Input number of elements in array list: ");
        int size = scanner.nextInt();
        System.out.println("Input elements of array list: ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }

        System.out.println("Sum of all elements in array list is: " + sum);
    }
}
