package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob4 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Input number of elements in array: ");
        int size = scanner.nextInt();
        int sum = 0;
        System.out.println("Input elements of array: ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < size; i++) {
            sum += list.get(i);
        }
        double average = (double)sum/list.size();
        System.out.println("The average of list is: " + average);

    }
}
