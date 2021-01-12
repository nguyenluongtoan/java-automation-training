package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob5 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("The string after remove duplicated characters is: " + removeDuplicate(str));
        // removeDuplicate(str);
    }

    public static String removeDuplicate (String str) {
        Set<Character> hs = new HashSet<>();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(!hs.contains(str.charAt(i))) {
                newString.append(str.charAt(i));
                hs.add(str.charAt(i));
            }
        }
        return newString.toString();
    }

}
