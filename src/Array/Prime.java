package Array;

import java.util.Scanner;

public class Prime {
        public static boolean checkPrime(int n){
            if(n <=2){
                return true;
            }else{
                for(int i = 2; i<=Math.sqrt(n);i++){
                    if(n%i == 0){
                        return false;
                    }
                }
            }
            return true;
        }
        // function check number is prime or not

    public static void primeAnalyze(int n){
        for(int i=2;i<=n;i++){
            while(checkPrime(i) && (n%i ==0)){
                System.out.print(" " + i);
                n/=i;
            }
        }
    }
    // analyze a prime

    public static void main (String []args) {
        Prime pt = new Prime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the prime: ");
        int pr = scanner.nextInt();
        pt.primeAnalyze(pr);
    }
    }

