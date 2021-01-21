package BonusExercise;

import java.util.Random;
import java.util.Scanner;

// Description: Nhập vào số lượng các ố random và on ra các số random
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of random numbers: ");
        int n = scanner.nextInt();

        Random rd = new Random();
        System.out.println("Random numbers are: ");
        for (int i = 1; i <= n ; i++) {
            System.out.println(rd.nextInt(100));
        }
    }


}
