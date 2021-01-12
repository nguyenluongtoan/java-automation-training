package String;

import java.util.Scanner;

public class Prob4 {
    public static void main(String []args) {
        int nov = 0;
        int noc = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = scanner.nextLine();
        scanner.close();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' | c == 'u') {
                nov++;
            } else if (c >= 'a' && c <= 'z') {
                noc++;

            }
        }
        System.out.println("Number of vowels: " + nov);
        System.out.println("Number of consonants: " + noc);
    }
}
