package Array;

public class GcdAndLcm {

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
        if (b == 0) return a;
        return findLcm(b, a % b);
    }

}
