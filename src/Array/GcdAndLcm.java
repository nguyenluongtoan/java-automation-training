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
        return b;
    }
}
