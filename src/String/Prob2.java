package String;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string: ");
        String s1 = scanner.nextLine();
        System.out.println("Input second string: ");
        String s2 = scanner.nextLine();
        isAnagram(s1,s2);


    }

    public static void isAnagram(String s1, String s2) {
        String reverse = new StringBuffer(s1).reverse().toString();
        if (s1.length() == s2.length()) {
            if (s2.equals(reverse)) {
                System.out.println("OK");
            } else {
                System.out.println("KO");
            }
        }
    }
}

