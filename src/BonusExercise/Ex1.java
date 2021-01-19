package BonusExercise;
import java.util.Scanner;
// Description: Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
public class Ex1 {
    public static int inputNumber(){
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check){
            System.out.print(" ");
            try{
                n= input.nextInt();
                check= true;
            }catch(Exception e){
                System.out.println("Input number, please again...");
                input.nextLine();
            }
        }
        return (n);
    }
    public static int countSum(long i){
        int sum=0;
        long n;
        while(i!=0){
            n= i%10;
            sum+= n; i/=10;
        }
        return (sum);
    }
    public static void main(String[] args){
        System.out.print("Input n: ");
        int n= inputNumber();
        System.out.println("Sum of all elements in"+n+" = " +countSum(n));
    }
}