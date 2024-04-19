package methods;
import java.util.Scanner;
public class Qus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        isPrime(a);
    }
    static void isPrime(int a){
        if(a<=0){
            System.out.println("Enter number greater than 0");
        }
        else{
            while(a!=0){
                if(a==0){
                    System.out.println("Even");
                }
                else {
                    System.out.println("odd");
                }
                a=a%2;
            }
        }
    }
}
