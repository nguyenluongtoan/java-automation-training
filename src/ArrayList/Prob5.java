package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob5 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Input number of elements in array: ");
        int size = scanner.nextInt();
        System.out.println("Input elements of array: ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }

        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max elements of list is: " + max);

    }
}
