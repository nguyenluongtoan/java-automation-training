package String;

import java.util.Scanner;

public class Prob3 {
    public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input string: ");
    String str = sc.nextLine();
    String numOnly = str.replaceAll("\\p{Alpha}","");
    try {
        double numVal = Double.valueOf(numOnly);
        System.out.println("The string contains numbers");
    } catch (NumberFormatException e){
        System.out.println("The string don't contains numbers");
    }
    }
}
