package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob6 {
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
        int max2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(max == list.get(i)) {
                continue;
            } else if(list.get(i) > max2) {
                max2 = list.get(i);
            }
        }

        System.out.println("The second max value of list is: " + max2);
    }
}
