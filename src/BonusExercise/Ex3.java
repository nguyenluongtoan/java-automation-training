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
        Ex3 e = new Ex3();
        System.out.println("The descending order: ");
        e.sortByDes(arr);
        System.out.println("The ascending order: ");
        e.sortByAsc(arr);
    }
        public void sortByAsc(int a[]){
            int temp;
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i] + "\t");
            }

        }
        // Sort by asc order

    public void sortByDes(int b[]){
        int temp;
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - 1 - i; j++) {
                if (b[j] < b[j + 1]) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "\t");
        }
    }


    }

