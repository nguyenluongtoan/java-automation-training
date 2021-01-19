package BonusExercise;

import java.util.Scanner;

// Description: đảo ngược các từ trong chuỗi Java
public class Ex2 {
    public void reverseWordInString (String str) {
        String[] words = str.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);

    }
    public static void main (String[] args) {
        Ex2 test = new Ex2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("Reverse string: ");
        test.reverseWordInString(str);
    }
}
