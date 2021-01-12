package String;

import java.util.Scanner;

public class Prob6 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input adn circuit: ");
        String str = scanner.nextLine();
        scanner.close();
        System.out.println("The coressponding circuit: " + addDashCharacter(processString(str)));

    }

    public static String processString(String str) {
        StringBuilder s = new StringBuilder();
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'A') {
                    s.append("T");
            } else if(str.charAt(i) == 'T') {
                s.append("A");
            } else if (str.charAt(i) == 'G') {
                s.append("X");
            }  else if (str.charAt(i) == 'X') {
            s.append("G");
        }

        }

        return s.toString();
    }

    public static String addDashCharacter(String str) {
        processString(str);
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
           if(i > 0) {
               s1.append("-");
           }
           s1.append(str.charAt(i));
        }
        return s1.toString();

    }

}
