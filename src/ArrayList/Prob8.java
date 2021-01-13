package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Prob8 {
    public static void main(String []args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
        System.out.println("Input number of elements in array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input elements of array: ");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextLine());
        }

        System.out.println("Add an element to list: ");
        String element = scanner.nextLine();
        System.out.println("At index: ");
        int index = scanner.nextInt();
        list.add(index,element);
        System.out.println("List after updating: " + list);
    }
}
