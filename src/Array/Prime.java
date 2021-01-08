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
        // function check number í prime or not


    }

