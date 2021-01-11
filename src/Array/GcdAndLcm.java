package Array;

import java.util.Scanner;

public class GcdAndLcm {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("int b: ");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("The greatest common divisor of a and b is: " + findGcd(a,b));
        System.out.println("The least common multiple of a and b is: " + findLcm(a,b));
}

public static int findGcd(int a, int b) {
    while (a != b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }
    }
    return b;
}

public static int findLcm(int a, int b) {
        return  (a*b)/findGcd(a,b);
    }

}
