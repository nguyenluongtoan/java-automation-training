package Array;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of elements in array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input number: ");
            arr[i] = sc.nextInt();
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.println("Elements in array are: " + arr[i]);
        }
    }
}
